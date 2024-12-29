package FactoryPattern;

public class MomoPayment extends AbstractPayment{
    @Override
    public void validatePayment() {
        System.out.println("Validating Momo payment details...");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Momo payment of $" + amount);
        logTransaction("Momo payment processed");
    }
}
