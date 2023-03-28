package kg.alatoo.demodi.controllers;

import kg.alatoo.demodi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

    @Autowired
    private GreetingService greetingService;

    public String sayHello() {
        System.out.println(greetingService.sayHello());

        return "Hi From Property based Injection!";
    }
}
