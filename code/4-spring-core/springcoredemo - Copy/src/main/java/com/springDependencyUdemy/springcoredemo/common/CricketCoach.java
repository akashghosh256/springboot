package com.springDependencyUdemy.springcoredemo.common;


import com.springDependencyUdemy.springcoredemo.common.Coach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Harvey Spceter Kicks ASS";
    }
}
