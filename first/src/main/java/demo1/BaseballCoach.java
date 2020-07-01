package demo1;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;
    private int number;

    public BaseballCoach(final FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    public void setNumber1(int number){
        this.number = number;
    }

    @Override
    public String getDailyWorkout(){
        return "Practice batting everyday";
    }

    @Override
    public String tellFortune() { return fortuneService.predict(); }

    @Override
    public String printNumber(){
        return Integer.toString(this.number);
    }
}
