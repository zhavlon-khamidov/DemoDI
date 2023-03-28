package kg.alatoo.demodi.controllers;

import kg.alatoo.demodi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectionController {

    private GreetingService greetingService;

    public String sayHello() {
        return "Hi From setter based Injection!";
    }

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        System.out.println("Injecting service with setter");
        this.greetingService = greetingService;
    }
}
