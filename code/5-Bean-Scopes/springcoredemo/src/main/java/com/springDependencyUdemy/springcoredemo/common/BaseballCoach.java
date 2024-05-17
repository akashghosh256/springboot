package com.springDependencyUdemy.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class BaseballCoach implements Coach{
    public BaseballCoach(){
        System.out.println("BaseBall coach :" + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Baseball COACherrrrrrr";
    }
}
