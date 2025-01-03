package ObserverPattern.Have_ObserverPattern;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);

    void notifyObservers();
}
