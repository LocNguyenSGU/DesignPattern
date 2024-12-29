package FactoryPattern;

public class PaymentFactory {
    public static Payment createPayment(String type) {
        switch (type.toLowerCase()) {
            case "momo":
                return new MomoPayment();
            case "shoppe":
                return new ShoppePayment();
            default:
                throw new IllegalArgumentException("Phương thức thanh toán không hợp lệ: " + type);
        }
    }
}
