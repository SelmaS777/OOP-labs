package week13.Task2;

public class Main {
    public static void main(String[] args) {
        PaymentFactory creditCardFactory = new CreditCardPaymentFactory();
        PaymentFactory paypalFactory = new PayPalPaymentFactory();

        Payment creditCardPayment = creditCardFactory.createPayment();
        Payment paypalPayment = paypalFactory.createPayment();

        creditCardPayment.processPayment();
        paypalPayment.processPayment();
    }
}
