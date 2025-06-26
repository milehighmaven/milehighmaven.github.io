import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class PaymentClient {
    public static void main(String[] args) {
        try {
            String jsonInput = "{\n"
                + "  \"organizationName\": \"Healthy Life Clinic\",\n"
                + "  \"taxIdNumber\": \"123456789\",\n"
                + "  \"mailingAddress\": \"123 Wellness Blvd, Denver, CO\",\n"
                + "  \"contactEmail\": \"admin@healthylife.com\",\n"
                + "  \"contactPhone\": \"303-123-4567\",\n"
                + "  \"paymentMethod\": \"ACH\",\n"
                + "  \"bankName\": \"Bank of America\",\n"
                + "  \"accountNumber\": \"0123456789\",\n"
                + "  \"routingNumber\": \"987654321\"\n"
                + "}";
            URL url = new URL("https://localhost:5001/api/paymentmethod");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json; utf-8");
            con.setDoOutput(true);
            try (OutputStream os = con.getOutputStream()) {
                byte[] input = jsonInput.getBytes("utf-8");
                os.write(input, 0, input.length);
            }
            int code = con.getResponseCode();
            System.out.println("Response code: " + code);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}