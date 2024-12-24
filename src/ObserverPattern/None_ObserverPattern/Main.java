package ObserverPattern.None_ObserverPattern;

public class Main {
    public static void main(String[] args) {
        NewsPublisher newsPublisher = new NewsPublisher();
        Subscriber s1 = new Subscriber("An");
        Subscriber s2 = new Subscriber("Dung");

        newsPublisher.addSubscriber(s1);
        newsPublisher.addSubscriber(s2);

        newsPublisher.publishNews("Tin tuc cuc hot 1");

        newsPublisher.removeSubscriber(s1);
        newsPublisher.publishNews("Tin tuc cuc hot 2");
     }
}
