package observer.a;

import java.util.ArrayList;
import java.util.List;

abstract public class Observable<T> {
    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void changeProperty(T source, String propertyName, Object newValue) {
        observers.stream().forEach((o) ->
                o.handle(new TrackPropertyChange<>(source, propertyName, newValue)));
    }
}
