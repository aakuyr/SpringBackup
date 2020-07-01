package observer.a;

public class Person extends Observable<Person>{
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        changeProperty(this, "age", age);
    }

    private int age;
}
