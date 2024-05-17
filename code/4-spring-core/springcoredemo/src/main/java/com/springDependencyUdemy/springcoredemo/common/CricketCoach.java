package com.springDependencyUdemy.springcoredemo.common;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("cricket coach :" + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Harvey Spceter Kicks ASSES";
    }
}
