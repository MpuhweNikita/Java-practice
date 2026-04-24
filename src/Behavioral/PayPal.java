package Behavioral;

public class PayPal implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println(amount+"paid using PayPal");

    }
}
