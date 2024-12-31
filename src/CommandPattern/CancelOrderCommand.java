package CommandPattern;

public class CancelOrderCommand implements Command{
    private OrderService orderService;
    private int orderId;

    public CancelOrderCommand(OrderService orderService, int orderId) {
        this.orderService = orderService;
        this.orderId = orderId;
    }

    @Override
    public void execute() {
        orderService.cancelOrder(orderId);
    }

    @Override
    public void undo() {
        orderService.createOrder(orderId);
    }
}
