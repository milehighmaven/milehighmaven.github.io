# ACH Payment App

## Project Structure
```
ach-payment-app/
├── backend/          # .NET 8 API project
├── client-java/      # Java client console app
├── frontend/         # Static HTML/JS frontend
└── README.md         # This file
```

## Prerequisites
- .NET 8 SDK
- Java JDK (11+)

## Testing

1. **Run the .NET API**
   ```bash
   cd backend
   dotnet run
   ```
   The API listens on https://localhost:5001.

2. **Open Frontend**
   - Open `frontend/index.html` in a browser.
   - Fill out the form and submit to see the response.

3. **Run Java Client**
   ```bash
   cd client-java
   javac PaymentClient.java
   java PaymentClient
   ```
   You should see the response code printed.
