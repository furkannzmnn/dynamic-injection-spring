package com.example.dynamicinjectionspring;

import org.springframework.stereotype.Service;

@Service("mysql")
public class MySqlDriver implements ConnectionDriver{
    @Override
    public String connect() {
        return "Connected to MySQL";
    }
}
