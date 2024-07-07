package DependencyInjection.PaymentExample.WithoutDI;

public class CreditCardPaymentService implements PaymentService{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
