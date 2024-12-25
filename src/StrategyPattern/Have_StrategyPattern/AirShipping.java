package StrategyPattern.Have_StrategyPattern;

public class AirShipping implements ShippingStrategy{
    @Override
    public double calculateShippingCost(double weight) {
        return weight * 10;
    }
}
