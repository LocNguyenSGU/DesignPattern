package CommandPattern;

public class Main {
    // ===== Lý thuyết Command Pattern =====
    // 1. Khái niệm:
    //    Command Pattern cho phép đóng gói các yêu cầu (hành động) dưới dạng đối tượng,
    //    giúp dễ dàng thực hiện, hoàn tác hoặc lưu trữ các hành động.

    // 2. Thành phần chính:
    //    - Command (Giao diện hoặc lớp trừu tượng): Định nghĩa phương thức execute().
    //    - ConcreteCommand (Lệnh cụ thể): Thực hiện hành động cụ thể.
    //    - Receiver (Người nhận): Lớp xử lý logic thực tế.
    //    - Invoker (Người gọi): Thực thi lệnh và lưu lịch sử lệnh (nếu cần).
    //    - Client: Tạo và truyền lệnh.

    // 3. Cách triển khai:
    //    - Tạo giao diện Command với phương thức execute() và undo().
    //    - Tạo các lớp lệnh cụ thể kế thừa từ Command.
    //    - Tạo Receiver thực hiện logic thực tế.
    //    - Dùng Invoker để gọi các lệnh.

    // 4. Lợi ích:
    //    - Hỗ trợ Undo/Redo dễ dàng.
    //    - Giảm phụ thuộc giữa phần gọi lệnh và phần thực thi lệnh.
    //    - Dễ mở rộng để thêm hành động mới mà không sửa code hiện tại.

    // ===== Ví dụ thực tế sử dụng Command Pattern =====
    // 1. Hệ thống đặt vé máy bay: Đặt vé, hủy vé, đổi vé.
    // 2. Quản lý tài khoản ngân hàng: Rút tiền, gửi tiền, hoàn tác giao dịch.
    // 3. Ứng dụng e-commerce: Thêm sản phẩm vào giỏ, xóa sản phẩm, hoàn tác thêm.
    // 4. Game: Điều khiển nhân vật (di chuyển, tấn công, phòng thủ).
    // 5. Quản lý workflow: Thực thi các tác vụ theo trình tự, hỗ trợ rollback.

    // ===== Triển khai ví dụ đơn giản: Quản lý đơn hàng =====
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        CommandManager manager = new CommandManager();

        // Tạo các lệnh
        Command createOrder = new CreateOrderCommand(orderService, 101);
        Command cancelOrder = new CancelOrderCommand(orderService, 101);
        Command refundOrder = new RefundOrderCommand(orderService, 101);

        // Thực hiện các lệnh
        System.out.println("=== Quản lý đơn hàng ===");
        manager.executeCommand(createOrder);  // Output: Đã tạo đơn hàng với ID: 101
        manager.executeCommand(cancelOrder);  // Output: Đã hủy đơn hàng với ID: 101
        manager.executeCommand(refundOrder);  // Output: Đã hoàn tiền cho đơn hàng với ID: 101

        // Hoàn tác lệnh
        System.out.println("\n=== Hoàn tác lệnh ===");
        manager.undoLastCommand(); // Output: Hoàn tác hoàn tiền không thực hiện được.
        manager.undoLastCommand(); // Output: Đã tạo lại đơn hàng với ID: 101
        manager.undoLastCommand(); // Output: Đã hủy đơn hàng với ID: 101
    }
}
