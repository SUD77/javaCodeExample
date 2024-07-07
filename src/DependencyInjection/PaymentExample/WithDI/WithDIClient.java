package DependencyInjection.PaymentExample.WithDI;

public class WithDIClient {
    public static void main(String[] args) {
        // Create the app with credit card payment service
        RideSharingApp app = AppInjector.createAppWithCreditCard();
        // Process payment
        app.processRidePayment(100.0);

        // Create the app with PayPal payment service
        RideSharingApp appWithPayPal = AppInjector.createAppWithPayPal();
        // Process payment
        appWithPayPal.processRidePayment(150.0);
    }
}
