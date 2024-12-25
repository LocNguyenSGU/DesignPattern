package StrategyPattern.None_StrategyPattern;

public class Main {
    public static void main(String[] args) {
        ShippingService shippingService = new ShippingService();

        // Sử dụng phương thức vận chuyển khác nhau
        System.out.println("Road shipping cost: " + shippingService.calculateShippingCost("road", 10));
        System.out.println("Air shipping cost: " + shippingService.calculateShippingCost("air", 10));
    }
}
