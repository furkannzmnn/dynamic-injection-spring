package com.example.dynamicinjectionspring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Qualifier("getConnectionDriver")
    private final ConnectionDriver connectionDriver;
    public UserService(@Qualifier("getConnectionDriver") ConnectionDriver connectionDriver) {
        this.connectionDriver = connectionDriver;
    }

    public void connect() {
        String connect = connectionDriver.connect();
        System.out.println(connect);
    }
}
