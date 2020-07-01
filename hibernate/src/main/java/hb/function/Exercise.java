package hb.function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class Exercise {
    @Autowired
    Environment environment;

    public void exercise(){
        System.out.println("Trying to crank out pushpus and some cc probs");
        System.out.println("Plus " + environment.getProperty("sai"));
    }
}
