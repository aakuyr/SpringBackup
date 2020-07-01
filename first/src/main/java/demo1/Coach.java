package demo1;

public interface Coach {
    public String getDailyWorkout();

    public String tellFortune();

    default String printNumber(){
        return "RANDOM";
    }

}
