package org.demo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

    FortuneService fortuneService;

    @Value("${team}")
    private String team;

    @Value("${email}")
    private String email;

    @Override
    public String getDailyWorkout() {
        return "Swim one km a day";
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getTeam() {
        return team;
    }
    public String getEmail() {
        return email;
    }

    @Override
    public String getFortune() {
        return fortuneService.tellFortune();
    }
}
