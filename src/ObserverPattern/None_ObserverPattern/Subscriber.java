package ObserverPattern.None_ObserverPattern;

public class Subscriber {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void receiveNotification(String message) {
        System.out.println(name + " nhan duoc thong bao: " + message);
    }

}
