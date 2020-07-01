package org.assignment;

public class MuayThaiCoach implements Coach{

    private FortuneService fortuneService;

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice kicking, boxing and elbow moves everyday";
    }

    @Override
    public String getFortune() {
        return fortuneService.tellFortune();
    }
}
