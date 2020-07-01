package org.demo;

import org.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MyApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);
        System.out.println(coach.getFortune());
        System.out.println(coach.getEmail());
        System.out.println(coach.getTeam());
        ((AnnotationConfigApplicationContext) context).close();
    }
}
