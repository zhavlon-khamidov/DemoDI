package kg.alatoo.demodi;

import kg.alatoo.demodi.controllers.ConstructorInjectionController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConstructorInjectionControllerTest {

    @Autowired
    ConstructorInjectionController constructorInjectionController;

    @Test
    void sayHello() {
        System.out.println(constructorInjectionController.sayHello());
    }
}