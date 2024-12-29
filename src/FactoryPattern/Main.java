package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        // Factory Pattern là một mẫu thiết kế tạo đối tượng, giúp ẩn đi logic khởi tạo đối tượng cụ thể,
        // thay vào đó sử dụng một Factory (nhà máy) để tạo ra các đối tượng thông qua giao diện chung (interface).

        // Ưu điểm của Factory Pattern:
        // 1. Đóng gói logic khởi tạo, tăng tính linh hoạt khi mở rộng (Open-Closed Principle).
        // 2. Giảm sự phụ thuộc vào lớp cụ thể, giúp code dễ bảo trì hơn.
        // 3. Tăng khả năng tái sử dụng mã.

        // Nhược điểm:
        // 1. Cần thêm lớp Factory, làm tăng độ phức tạp.
        // 2. Khi có nhiều loại đối tượng, logic trong Factory có thể trở nên khó quản lý.

        // Luồng chạy code:
        // Bước 1: Gọi phương thức createPayment() của PaymentFactory, truyền vào loại thanh toán ("momo").
        // Bước 2: Factory kiểm tra loại thanh toán và tạo đối tượng tương ứng (ở đây là MomoPayment).
        // Bước 3: Phương thức validatePayment() và processPayment() được gọi thông qua đối tượng được tạo.

        // Tạo phương thức thanh toán bằng Momo
        Payment momoPayment = PaymentFactory.createPayment("momo");
        momoPayment.validatePayment(); // Gọi validatePayment() của MomoPayment
        momoPayment.processPayment(100.50); // Gọi processPayment() của MomoPayment

        System.out.println();

        // Luồng chạy tiếp tục với loại thanh toán khác:
        // Bước 1: Gọi PaymentFactory.createPayment("shoppe").
        // Bước 2: Factory tạo ra đối tượng ShoppePayment.
        // Bước 3: Gọi validatePayment() và processPayment() của ShoppePayment.

        // Tạo phương thức thanh toán bằng Shoppe
        Payment shoppePayment = PaymentFactory.createPayment("shoppe");
        shoppePayment.validatePayment(); // Gọi validatePayment() của ShoppePayment
        shoppePayment.processPayment(250.75); // Gọi processPayment() của ShoppePayment

        // Bổ sung về Abstract Class:
        // 1. Abstract class giúp giảm thiểu sự lặp lại của các đoạn mã chung,
        // như logic kiểm tra hệ thống thanh toán-(hàm logTransaction)
        // 2. Abstract class có thể chứa các phương thức chung mà tất cả các lớp con đều cần,
        // trong khi các phương thức cụ thể (như validatePayment và processPayment) được định nghĩa trong các lớp con.
        // 3. Điều này giúp bảo trì và mở rộng hệ thống dễ dàng hơn mà không phải thay đổi các lớp con.

        // Ví dụ ở đây: AbstractPayment là một abstract class chứa logic chung,
        // còn MomoPayment và ShoppePayment chỉ cần triển khai các phương thức cụ thể của chúng.

    }
}