package org.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TableTennisCoach implements Coach {

    @Autowired
    private FortuneService fortuneService;

    public TableTennisCoach() {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Play ping pong :)";
    }

    @Override
    public String getFortune(){
        return fortuneService.tellFortune();
    }

}

