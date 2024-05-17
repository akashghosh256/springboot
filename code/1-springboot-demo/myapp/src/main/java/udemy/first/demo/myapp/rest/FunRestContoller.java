package udemy.first.demo.myapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FunRestContoller {
    // expose "/" point to return hello world
    @GetMapping
    public String  sayHello(){
        return "Hello world!";
    }


}
