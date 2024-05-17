package com.springDependencyUdemy.springcoredemo.rest;

import com.springDependencyUdemy.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // define private filed for the dependency
    private Coach myCoach;
  //  private Coach anotherCoach;
    // define a constructor for dependency injection

//    @Autowired
//    public DemoController(Coach theCoach){
//        myCoach = theCoach;
//    }

    // setter Injection
    // Qualifier Coach------
    @Autowired
    public void setCoach(
            @Qualifier("aquatic") Coach theCoach
          //  @Qualifier("cricketCoach") Coach theanotherCoach
 ){
        System.out.println(" Demo Controller coach :" + getClass().getSimpleName());

        myCoach = theCoach;
        //anotherCoach = theanotherCoach;
    }

    // primary coach-------
//    @Autowired
//    public void setCoach(Coach theCoach){
//        myCoach = theCoach;
//    }

    @GetMapping("/dailyworkout")
        public String getDailyWorkout(){
            return myCoach.getDailyWorkout();
        }


//        @GetMapping("/check")
//    public String check(){
//        return "Comparing beans :  myCoach == anotherCoach => " + (myCoach == anotherCoach);
//        }



        }
