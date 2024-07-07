package DependencyInjection.PaymentExample.WithoutDI;

public class RideSharingApp {
    private PaymentService paymentService;

    public RideSharingApp() {
        // Tightly coupled to specific implementation
        this.paymentService = new CreditCardPaymentService();
    }

    public void processRidePayment(double amount) {
        paymentService.processPayment(amount);
    }

    // Method to switch to PayPal payment service
    public void switchToPayPal() {
        this.paymentService = new PayPalPaymentService();
    }
}
