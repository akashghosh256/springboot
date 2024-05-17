package com.springDependencyUdemy.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TrackCoach implements Coach{
    public TrackCoach(){
        System.out.println("Track coach :" + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Tack Coach Runner";
    }
}
