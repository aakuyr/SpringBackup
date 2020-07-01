package state.gof;

public class LightState {
    public State state;

    public LightState() {
        this.state = new OffState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void on() {state.on(this);}

    public void off() {state.off(this);}
}
