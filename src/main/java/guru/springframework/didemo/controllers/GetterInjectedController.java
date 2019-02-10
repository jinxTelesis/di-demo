package guru.springframework.didemo.controllers;

import guru.springframework.didemo.Services.GreetingService;
import guru.springframework.didemo.Services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class GetterInjectedController {

    private GreetingService greetingService; // interface

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    @Autowired
    @Qualifier("getterGreetingService")
    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }




}
