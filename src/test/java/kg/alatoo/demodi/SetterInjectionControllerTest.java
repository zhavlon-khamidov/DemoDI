package kg.alatoo.demodi;

import kg.alatoo.demodi.controllers.SetterInjectionController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SetterInjectionControllerTest {

    @Autowired
    SetterInjectionController setterInjectionController;

    @Test
    void sayHello() {
        System.out.println(setterInjectionController.sayHello());
    }
}