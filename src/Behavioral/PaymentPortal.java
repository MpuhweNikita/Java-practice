package Behavioral;

public class PaymentPortal {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext(new CreditCardPayment());
        context.pay(5000);
        context.setPaymentStrategy(new PayPal());
        context.pay(1000);
    }
}
