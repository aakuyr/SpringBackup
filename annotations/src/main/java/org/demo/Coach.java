package org.demo;

public interface Coach {
    public String getDailyWorkout();
    default public String getFortune(){
        return "DEFAULT IMPLEMENTATION OF GET FORTUNE";
    };
}
