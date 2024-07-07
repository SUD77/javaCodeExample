package DependencyInjection.PaymentExample.WithDI;

public class RideSharingApp {
    private PaymentService paymentService;

    // Constructor injection
    public RideSharingApp(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processRidePayment(double amount) {
        paymentService.processPayment(amount);
    }
}
