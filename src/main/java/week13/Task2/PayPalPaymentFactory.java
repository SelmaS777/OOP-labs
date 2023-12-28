package week13.Task2;

public class PayPalPaymentFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new PayPalPayment();
    }
}
