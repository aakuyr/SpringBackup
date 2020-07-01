package observer.b;

import java.util.HashMap;
import java.util.function.Consumer;

public class Event<T> {
    private HashMap<Integer, Consumer<T>> handlers = new HashMap<>();
    private int count = 0;
    public Subscription addHandler(Consumer<T> handler) {
        handlers.put(count, handler);
        return new Subscription(count++, this);
    }
    public void handle(T args){
    handlers.values().forEach(i -> i.accept(args));
    }
    private class Subscription implements AutoCloseable{
        private int id;

        private Event<T> event;

        public Subscription(int id, Event<T> event) {
            this.id = id;
            this.event = event;
        }

        @Override
        public void close() throws Exception {
            event.handlers.remove(id);
        }
    }
}
