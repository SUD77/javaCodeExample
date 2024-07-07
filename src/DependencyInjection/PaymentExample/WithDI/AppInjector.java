package DependencyInjection.PaymentExample.WithDI;

public class AppInjector {

    public static RideSharingApp createAppWithCreditCard() {
        PaymentService paymentService = new CreditCardPaymentService();
        return new RideSharingApp(paymentService);
    }

    public static RideSharingApp createAppWithPayPal() {
        PaymentService paymentService = new PayPalPaymentService();
        return new RideSharingApp(paymentService);
    }
}
