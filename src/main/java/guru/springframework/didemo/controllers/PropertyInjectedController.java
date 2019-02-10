package guru.springframework.didemo.controllers;

import guru.springframework.didemo.Services.GreetingService;
import guru.springframework.didemo.Services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {


    @Autowired
    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }



}