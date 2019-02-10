package guru.springframework.didemo.controllers;

import guru.springframework.didemo.Services.GreetingService;
import guru.springframework.didemo.Services.GreetingServiceImpl;

public class GetterInjectedController {

    private GreetingService greetingService; // interface

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }




}
