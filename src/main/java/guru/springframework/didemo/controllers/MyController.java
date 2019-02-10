package guru.springframework.didemo.controllers;

import guru.springframework.didemo.Services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    // == uses primary ==
    public MyController() {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello!");
        return greetingService.sayGreeting();
    }

}
