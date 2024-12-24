package ObserverPattern.Have_ObserverPattern;


import java.util.ArrayList;
import java.util.List;

public class NewsPublisher implements Subject{
    private List<Observer> observerList = new ArrayList<>();
    private String news;
    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observerList) {
            o.update(news);
        }
    }

    public void publicNews(String news) {
        this.news = news;
        notifyObservers();
    }
}
