package org.demo;

public class PushupCoach implements Coach {

    private FortuneService fortuneService;

    public PushupCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "100 pushups a day!";
    }

    @Override
    public String getFortune() {
        return fortuneService.tellFortune();
    }
}
