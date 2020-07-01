package state.modern;

import org.javatuples.Pair;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class UsePhone {
    private static HashMap<State, List<Pair<Trigger, State> >> routes = new HashMap<>();
    static {
        routes.put(State.OFF_HOOK, Arrays.asList(
                new Pair<>(Trigger.MAKE_CALL, State.CONNECTING),
                new Pair<>(Trigger.STOP_PHONE, State.ON_HOOK)
        ));

        routes.put(State.CONNECTING, Arrays.asList(
                new Pair<>(Trigger.CALL_CONNECTED, State.CONNECTED),
                new Pair<>(Trigger.HANG_UP, State.OFF_HOOK)
        ));

        routes.put(State.CONNECTED, Arrays.asList(
                new Pair<>(Trigger.PLACE_ON_HOLD, State.ON_HOLD),
                new Pair<>(Trigger.HANG_UP, State.OFF_HOOK),
                new Pair<>(Trigger.LEFT_MESSAGE, State.OFF_HOOK)
        ));

        routes.put(State.ON_HOLD, Arrays.asList(
                new Pair<>(Trigger.TAKE_OFF_HOLD, State.CONNECTED),
                new Pair<>(Trigger.HANG_UP, State.OFF_HOOK)
        ));
    }

    private State currentState;
    private static final State exitState = State.ON_HOOK;

    public UsePhone(){
        this.currentState = State.OFF_HOOK;
    }

    public List<Trigger> action(Trigger t){
        long numberOfMatchingTrigger = routes.get(currentState).stream()
                .filter(i -> i.getValue0() == t)
                .count();
        if (numberOfMatchingTrigger < 1) System.out.println("No such trigger possible for current action");
        else routes.get(currentState).stream()
                .filter(i -> i.getValue0() == t)
                .forEach(i -> currentState = i.getValue1());
        return routes.get(currentState).stream().map(i -> i.getValue0()).collect(Collectors.toList());
    }
}
