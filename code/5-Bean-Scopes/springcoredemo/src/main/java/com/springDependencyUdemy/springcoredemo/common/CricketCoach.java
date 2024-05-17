package com.springDependencyUdemy.springcoredemo.common;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component

public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("cricket coach :" + getClass().getSimpleName());
    }
// loads from start
    // define our init method
//    @PostConstruct
//    public void doMyStartupStuff() {
//        System.out.println("In doMyStartupStuff(): " + getClass().getSimpleName());
//    }
//
//    // leaves when end
//    @PreDestroy
//    public void doMyCleanupStuff() {
//        System.out.println("In doMyCleanupStuff(): " + getClass().getSimpleName());
//    }
    @Override
    public String getDailyWorkout() {
        return "Harvey Spceter Kicks ASSES form CricketCoach.java";
    }
}
