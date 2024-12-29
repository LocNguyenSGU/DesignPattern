package FactoryPattern;

public class ShoppePayment extends AbstractPayment{
    public ShoppePayment() {}

    @Override
    public void validatePayment() {
        System.out.println("Validating Shoppe payment details...");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Shoppe payment of $" + amount);
        logTransaction("Shoppe payment processed");
    }
}
