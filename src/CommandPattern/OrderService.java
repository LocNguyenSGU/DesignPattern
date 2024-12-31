package CommandPattern;

public class OrderService {
    public void createOrder(int orderId) {
        System.out.println("Tao don hang: " + orderId);
    }
    public void cancelOrder(int orderId) {
        System.out.println("Huy don hang: " + orderId);
    }
    public void refundOrder(int orderId) {
        System.out.println("Hoan tra tien don hang: " + orderId);
    }
}
