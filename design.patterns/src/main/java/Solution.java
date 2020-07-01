import dynamic.proxy.Human;
import dynamic.proxy.LoggingHandler;
import dynamic.proxy.Person;

import java.lang.reflect.Proxy;

public class Solution {

    @SuppressWarnings(value = "unchecked")
    public static <T> T withLogging(T object, Class<T> targetInterface) {
        return (T) Proxy.newProxyInstance(
                targetInterface.getClassLoader(),
                new Class<?>[]{targetInterface},
                new LoggingHandler(object)
        );
    }

    public static void main(String[] args) throws Exception {
        Person person = new Person();
        Human h = withLogging(person, Human.class);

        h.walk();
        h.walk();
        h.walk();

        System.out.println(h);
    }

}