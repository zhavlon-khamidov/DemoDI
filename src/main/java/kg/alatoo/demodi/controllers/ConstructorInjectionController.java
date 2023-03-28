package kg.alatoo.demodi.controllers;

import kg.alatoo.demodi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectionController {


    private final GreetingService greetingService;

    @Autowired
    public ConstructorInjectionController(GreetingService greetingService) {
        System.out.println("Message from Controller");
        System.out.println(greetingService.sayHello());
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return "Hi From Constructor based Injection!";
    }
}
