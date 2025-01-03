package IteratorPattern;

// Lớp Main để chạy ví dụ sử dụng Iterator Pattern
public class Main {
    public static void main(String[] args) {
        // Tạo một bộ sưu tập người dùng (UserCollection)
        UserCollection userCollection = new UserCollection();

        // Thêm các đối tượng người dùng (User) vào bộ sưu tập
        userCollection.addUser(new User(1, "Alice"));
        userCollection.addUser(new User(2, "Bob"));
        userCollection.addUser(new User(3, "Charlie"));

        // Sử dụng phương thức createIterator() để tạo một Iterator cho danh sách người dùng
        Iterator<User> userIterator = userCollection.createIterator();

        // Duyệt qua danh sách người dùng bằng Iterator
        System.out.println("Danh sách người dùng:");
        while (userIterator.hasNext()) { // Kiểm tra nếu còn phần tử tiếp theo
            User user = userIterator.next(); // Lấy phần tử tiếp theo
            System.out.println(user); // In thông tin người dùng ra console
        }
    }
}

/**
 * **Lý thuyết về các thành phần của Iterator Pattern:**
 *
 * **1. Iterator Interface:**
 * - Xác định giao diện chung cho việc duyệt qua một tập hợp (collection).
 * - Trong ví dụ này, `Iterator<T>` là interface định nghĩa các phương thức:
 *   - `boolean hasNext()`: Kiểm tra xem còn phần tử nào trong tập hợp không.
 *   - `T next()`: Lấy phần tử tiếp theo trong tập hợp.
 *
 * **2. Concrete Iterator:**
 * - Cung cấp một triển khai cụ thể của giao diện `Iterator`.
 * - Trong ví dụ, một lớp riêng sẽ được dùng để duyệt qua danh sách người dùng trong `UserCollection`.
 *
 * **3. Aggregate Interface:**
 * - Xác định giao diện chung cho tập hợp dữ liệu, bao gồm cả việc tạo Iterator.
 * - Trong ví dụ này, `UserCollection` đóng vai trò là tập hợp.
 *   - Phương thức `createIterator()` cho phép tạo một đối tượng `Iterator`.
 *
 * **4. Concrete Aggregate:**
 * - Là một triển khai cụ thể của tập hợp dữ liệu, thường chứa các đối tượng cần duyệt qua.
 * - Trong ví dụ này, `UserCollection` là một lớp cụ thể lưu danh sách người dùng và hỗ trợ thêm/xóa người dùng.
 *
 * **5. Main Class:**
 * - Đây là lớp chính sử dụng `Iterator Pattern`.
 * - Trong ví dụ này, lớp `Main` sử dụng `UserCollection` và `Iterator` để duyệt qua danh sách người dùng.
 *
 * **Lợi ích của Iterator Pattern:**
 * - Tách biệt logic duyệt qua tập hợp khỏi cách lưu trữ dữ liệu.
 * - Dễ dàng thay đổi cách duyệt mà không ảnh hưởng đến tập hợp dữ liệu.
 * - Hỗ trợ duyệt linh hoạt theo các điều kiện cụ thể (ví dụ: duyệt có lọc).
 */