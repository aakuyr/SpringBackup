package state.gof;

import state.gof.LightState;

public interface State{
     default void on(LightState t) {
         System.out.println("Light is already turned on...");
     }
     default void off(LightState t){
         System.out.println("Light is already turned off...");
     };
}
