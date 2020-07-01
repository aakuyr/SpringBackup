package dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LoggingHandler implements InvocationHandler {

    Object target;

    Map<String, Integer> noOfMethodCalls = new HashMap<>();

    public LoggingHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        String methodName = method.getName();

        if (methodName.contains("toString")){
            return noOfMethodCalls.toString();
        }

        noOfMethodCalls.merge(methodName, 1, Integer::sum);

        return method.invoke(target, objects);
    }
}

