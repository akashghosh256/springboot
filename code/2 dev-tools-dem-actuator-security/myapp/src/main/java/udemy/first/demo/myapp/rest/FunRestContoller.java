package udemy.first.demo.myapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class FunRestContoller {

    // inject properties from application.properties
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

// expose new endpoint for "teaminfo"

    @GetMapping("/teaminfo")
    public String getTeaminfo(){
        return "coach:"+coachName + "team:" +teamName;
    }





    // expose "/" point to return hello world
    @GetMapping("/")
    public String  sayHello(){
        return "Hello world!";
    }

    @GetMapping("/workout")
    public String getWorkout(){
        return "Yo MAN workout GG";
    }





}
