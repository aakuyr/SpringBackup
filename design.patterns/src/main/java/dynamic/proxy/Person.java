package dynamic.proxy;

public class Person implements Human {
    @Override
    public void walk() {
        System.out.println("Person is walking");
    }

    @Override
    public void talk() {
        System.out.println("Person is talking");
    }
}
