package Behavioral;

public class MomoPay implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println(amount+"paid using MomoPay");
    }
}
