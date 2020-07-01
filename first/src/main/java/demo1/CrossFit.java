package demo1;

public class CrossFit implements Coach {

    private FortuneService fortuneService;


    public CrossFit(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Do AMAP pushups";
    }

    @Override
    public String tellFortune(){
        return fortuneService.predict();
    }

    public void init_method(){
        System.out.println("INIT METHOD");
    }

    public void clean_up(){
        System.out.println("CLEAN UP");
    }
}

