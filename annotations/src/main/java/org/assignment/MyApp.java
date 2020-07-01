package org.assignment;

import org.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Coach coach = context.getBean("muayThaiCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getFortune());

    }
}
