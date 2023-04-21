package com.example.dynamicinjectionspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConnectionDriverConfig {

    @Value("${connection.driver}")
    private String driver;

    @Autowired
    private ApplicationContext context;

    @Bean
    public ConnectionDriver getConnectionDriver() {
        return (ConnectionDriver) context.getBean(driver);
    }
}
