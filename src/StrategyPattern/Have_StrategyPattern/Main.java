package StrategyPattern.Have_StrategyPattern;
/*
Strategy Pattern:
- Là một mẫu thiết kế hành vi (Behavioral Pattern).
- Được sử dụng để định nghĩa một họ thuật toán, đặt từng thuật toán vào một lớp riêng,
  và làm cho chúng có thể thay thế lẫn nhau một cách linh hoạt.
- Các thành phần chính:
  + Strategy: Giao diện định nghĩa các thuật toán (ở đây là ShippingStrategy).
  + ConcreteStrategy: Các lớp triển khai cụ thể của Strategy (RoadShipping, AirShipping).
  + Context: Lớp sử dụng các chiến lược, chứa tham chiếu đến Strategy và gọi phương thức của Strategy (ShippingContext).

- Lợi ích:
  + Tách biệt thuật toán ra khỏi lớp sử dụng chúng (Context).
  + Dễ mở rộng thêm thuật toán mới mà không cần sửa đổi mã hiện có (tuân thủ nguyên lý Open/Closed).
  + Giảm sự phụ thuộc giữa các lớp, dễ bảo trì.

- Hạn chế:
  + Tăng số lượng lớp trong hệ thống.
  + Có thể phức tạp hơn so với cách sử dụng logic điều kiện (if-else, switch-case).

- Cách triển khai:
  1. Tạo giao diện Strategy để định nghĩa thuật toán.
  2. Tạo các lớp ConcreteStrategy triển khai giao diện.
  3. Tạo lớp Context chứa tham chiếu tới Strategy, và sử dụng nó để thực hiện thuật toán.

Ví dụ:
- Tính chi phí vận chuyển bằng các phương thức khác nhau (RoadShipping, AirShipping).
- Context (ShippingContext) sẽ sử dụng các chiến lược này linh hoạt thông qua phương thức setShippingStrategy.
*/
public class Main {
    public static void main(String[] args) {
        ShippingContext shippingContext = new ShippingContext();

        // Sử dụng vận chuyển đường bộ
        shippingContext.setShippingStrategy(new RoadShipping());
        System.out.println("Road shipping cost: " + shippingContext.calculateShippingCost(10));

        // Sử dụng vận chuyển đường hàng không
        shippingContext.setShippingStrategy(new AirShipping());
        System.out.println("Air shipping cost: " + shippingContext.calculateShippingCost(10));
    }
}
