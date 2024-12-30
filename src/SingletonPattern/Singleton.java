package SingletonPattern;

public class Singleton {
    // Sử dụng từ khóa volatile để đảm bảo tính đồng bộ trong môi trường đa luồng
    private static volatile Singleton instance;

    // Constructor private để ngăn không cho khởi tạo từ bên ngoài
    private Singleton() {
        System.out.println("Singleton instance created!");
    }

    // Double-Checked Locking để đảm bảo thread-safe
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) { // Đảm bảo chỉ 1 thread được vào đây cùng lúc
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Phương thức ví dụ
     void showMessage() {
        System.out.println("Hello from Singleton!");
    }


}
