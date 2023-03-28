package kg.alatoo.demodi;

import kg.alatoo.demodi.controllers.MainController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MainControllerTest {

    @Autowired
    MainController mainController;
    @Test
    void sayHello() {
        System.out.println(mainController.sayHello());
    }
}