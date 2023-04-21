package com.example.dynamicinjectionspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DynamicInjectionSpringApplication {

    private final UserService userService;

    public DynamicInjectionSpringApplication(UserService userService) {
        this.userService = userService;
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DynamicInjectionSpringApplication.class, args);
        DynamicInjectionSpringApplication bean = run.getBean(DynamicInjectionSpringApplication.class);
        bean.userService.connect();
    }

}
