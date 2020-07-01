package observer.a;

public class TrackPropertyChange<T> {
    private T source;
    private String methodName;
    private Object newValue;

    public TrackPropertyChange(T source, String methodName, Object newValue) {
        this.source = source;
        this.methodName = methodName;
        this.newValue = newValue;
    }

    @Override
    public String toString() {
        return String.format("TrackPropertyChange{source=%s, methodName='%s', newValue=%s}", source, methodName, newValue);
    }
}
