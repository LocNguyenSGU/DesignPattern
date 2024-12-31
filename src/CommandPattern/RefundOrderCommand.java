package CommandPattern;

public class RefundOrderCommand implements Command{
    private OrderService orderService;
    private int orderId;

    public RefundOrderCommand(OrderService orderService, int orderId) {
        this.orderService = orderService;
        this.orderId = orderId;
    }

    @Override
    public void execute() {
        orderService.refundOrder(orderId);
    }

    @Override
    public void undo() {
        System.out.println("Thao tac hoan tien khong thuc hien duoc");
    }
}
