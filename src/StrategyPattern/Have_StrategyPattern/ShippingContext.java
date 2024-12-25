package StrategyPattern.Have_StrategyPattern;

public class ShippingContext {
    private ShippingStrategy shippingStrategy;

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public double calculateShippingCost(double weight) {
        if (shippingStrategy == null) {
            throw new IllegalStateException("No shipping strategy set!");
        }
        return shippingStrategy.calculateShippingCost(weight);
    }

}
