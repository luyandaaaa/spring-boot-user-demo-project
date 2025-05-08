package com.example;

import com.example.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        
        // Get the UserService bean and test it
        UserService userService = context.getBean(UserService.class);
        
        System.out.println(userService.addUser("John", "Doe"));  // Will use ID 1
        System.out.println(userService.getUser(1L));
        System.out.println(userService.removeUser(1L));
    }
}
