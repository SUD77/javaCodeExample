package DependencyInjection.PaymentExample.WithoutDI;

public class WithoutDIClient {
    public static void main(String[] args) {
        // Create the app
        RideSharingApp app = new RideSharingApp();
        // Process payment
        app.processRidePayment(100.0);

        // Switch to PayPal and process payment
        app.switchToPayPal();
        app.processRidePayment(150.0);
    }
}
