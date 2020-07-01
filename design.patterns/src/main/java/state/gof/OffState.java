package state.gof;

public class OffState implements State {
    @Override
    public void on(LightState t) {
        System.out.println("Switching light on...");
        t.setState(new OnState());
    }
}
