package StrategyPattern.Have_StrategyPattern;

public class RoadShipping implements ShippingStrategy{
    @Override
    public double calculateShippingCost(double weight) {
        return weight * 5;
    }
}
