package demo1;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Run 5k everyday";
    }

    @Override
    public String tellFortune() {
        return fortuneService.predict();
    }
}
