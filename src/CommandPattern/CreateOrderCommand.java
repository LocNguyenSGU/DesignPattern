package CommandPattern;

public class CreateOrderCommand implements Command{
    private OrderService orderService;
    private int orderId;
    public CreateOrderCommand(OrderService orderService , int orderId) {
        this.orderService = orderService;
        this.orderId = orderId;
    }
    @Override
    public void execute() {
        orderService.createOrder(orderId);
    }

    @Override
    public void undo() {
        orderService.cancelOrder(orderId);
    }
}
