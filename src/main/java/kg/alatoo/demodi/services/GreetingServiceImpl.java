package kg.alatoo.demodi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        System.out.println("say hello method run");
        return "Hello World!";
    }
}
