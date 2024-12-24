package ObserverPattern.None_ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisher {
    private List<Subscriber> subscriberList = new ArrayList<>();
    private String news;

    public void addSubscriber(Subscriber subscriber) {
        this.subscriberList.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        this.subscriberList.remove(subscriber);
    }

    public void publishNews(String news) {
        this.news = news;
        for (Subscriber s : subscriberList) {
            s.receiveNotification(news);
        }
    }
}
