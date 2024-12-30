package SingletonPattern;

public class Main {
    public static void main(String[] args) {
        // Tạo nhiều luồng chạy đồng thời
        Thread thread1 = new Thread(() -> {
            Singleton singleton1 = Singleton.getInstance();
            singleton1.showMessage();
        });

        Thread thread2 = new Thread(() -> {
            Singleton singleton2 = Singleton.getInstance();
            singleton2.showMessage();
        });

        Thread thread3 = new Thread(() -> {
            Singleton singleton3 = Singleton.getInstance();
            singleton3.showMessage();
        });

        // Bắt đầu các luồng
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
