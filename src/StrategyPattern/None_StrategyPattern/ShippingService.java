package StrategyPattern.None_StrategyPattern;

public class ShippingService {
    public double calculateShippingCost(String method, double weight) {
        if(method.equalsIgnoreCase("road")) {
            return weight * 5;
        } else if (method.equalsIgnoreCase("air")) {
            return weight * 10;
        } else {
            throw new IllegalArgumentException("Invalid shipping method");
        }
    }
}
