package ObserverPattern.Have_ObserverPattern;

/*
Observer Pattern:
- Là mẫu thiết kế hành vi (Behavioral Pattern).
- Giúp một đối tượng (Subject) thông báo tự động cho nhiều đối tượng khác (Observers) khi có sự thay đổi trạng thái.

Cách triển khai:
1. Tạo interface Observer với phương thức `update(String message)`.
2. Tạo interface hoặc lớp Subject với các phương thức:
   - `attach(Observer observer)`: Thêm Observer.
   - `detach(Observer observer)`: Gỡ Observer.
   - `notifyObservers(String message)`: Thông báo cho tất cả Observer.
3. Tạo lớp Subject cụ thể để lưu danh sách Observer và triển khai các phương thức trên.
4. Tạo các lớp Observer cụ thể, triển khai giao diện Observer để thực hiện hành động khi nhận thông báo.

- Thành phần chính:
  + **Subject**: Quản lý danh sách các Observer và thông báo khi có thay đổi.
  + **Observer**: Lắng nghe và thực hiện hành động khi nhận được thông báo từ Subject.

- Lợi ích:
  + Giảm sự phụ thuộc giữa các lớp.
  + Dễ mở rộng (thêm Observer mà không cần sửa Subject).

- Hạn chế:
  + Có thể phức tạp khi số lượng Observer tăng.
  + Gây khó khăn trong việc debug nếu luồng thông báo phức tạp.
*/

public class Main {
    public static void main(String[] args) {
        NewsPublisher newsPublisher = new NewsPublisher();
        Subscriber s1 = new Subscriber("An");
        Subscriber s2 = new Subscriber("Dung");

        newsPublisher.attach(s1); // Thêm Observer
        newsPublisher.attach(s2); // Thêm Observer

        newsPublisher.publicNews("Tin tuc 1"); // Subject thông báo đến các Observer

        newsPublisher.detach(s2); // Gỡ Observer
        newsPublisher.publicNews("Tin tuc 2"); // Chỉ còn Observer "An" nhận thông báo
    }
}