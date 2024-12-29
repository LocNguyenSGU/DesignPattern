package FactoryPattern;

public interface Payment {
    void validatePayment();
    void processPayment(double amount);
}
