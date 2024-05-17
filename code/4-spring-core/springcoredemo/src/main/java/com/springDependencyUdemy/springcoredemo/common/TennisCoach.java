package com.springDependencyUdemy.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{


    public TennisCoach(){
        System.out.println("Tennis coach :" + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Tennis MAN COach";
    }
}
