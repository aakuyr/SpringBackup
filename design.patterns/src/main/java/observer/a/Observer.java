package observer.a;

public interface Observer {
    <T> void handle(TrackPropertyChange<T> args);
}
