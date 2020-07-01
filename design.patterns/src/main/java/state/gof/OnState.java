package state.gof;

public class OnState implements State {

    @Override
    public void off(LightState t) {
        System.out.println("Switching light off...");
        t.setState(new OnState());
    }
}
