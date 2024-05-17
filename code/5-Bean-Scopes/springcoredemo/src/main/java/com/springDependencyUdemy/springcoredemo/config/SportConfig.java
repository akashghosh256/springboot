package com.springDependencyUdemy.springcoredemo.config;


import com.springDependencyUdemy.springcoredemo.common.Coach;
import com.springDependencyUdemy.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
