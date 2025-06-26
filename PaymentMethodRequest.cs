namespace AchPaymentApp.Models
{
    public class PaymentMethodRequest
    {
        public string OrganizationName { get; set; }
        public string TaxIdNumber { get; set; }
        public string MailingAddress { get; set; }
        public string ContactEmail { get; set; }
        public string ContactPhone { get; set; }
        public string PaymentMethod { get; set; } // ACH or VirtualCard
        public string BankName { get; set; }
        public string AccountNumber { get; set; }
        public string RoutingNumber { get; set; }
    }
}