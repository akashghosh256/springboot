package com.springDependencyUdemy.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(
//		scanBasePackages = {"com.springDependencyUdemy.springcoredemo","com.udemy.util"}
//)

@SpringBootApplication
public class SpringcoredemoApplication {

	//http://localhost:8080/dailyworkout
	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
