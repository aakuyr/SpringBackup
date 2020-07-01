package org;

import org.assignment.MuayThaiCoach;
import org.assignment.RandomFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("org.assignment")
public class Config {

    @Bean
    public RandomFortuneService randomFortuneService(){
        return new RandomFortuneService();
    }

    @Bean
    protected MuayThaiCoach muayThaiCoach(){
        MuayThaiCoach muayThaiCoach = new MuayThaiCoach();
        muayThaiCoach.setFortuneService(randomFortuneService());
        return muayThaiCoach;
    }
}
