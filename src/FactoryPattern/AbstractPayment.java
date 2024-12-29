package FactoryPattern;

public abstract class AbstractPayment implements Payment{
    private String paymentId;


    public AbstractPayment() {
        this.paymentId = generatePaymentId();
    }
    // Logic chung cho các phương thức thanh toán
    public void logTransaction(String details) {
        System.out.println("[LOG] Payment ID: " + paymentId + ", Details: " + details);
    }

    // Phương thức riêng để tạo mã thanh toán
    private String generatePaymentId() {
        return "PAY-" + System.currentTimeMillis();
    }
}
