package com.example.dynamicinjectionspring;

import org.springframework.stereotype.Service;

@Service("mongo")
public class MongoDriver implements ConnectionDriver{
    @Override
    public String connect() {
        return "Connected to MongoDB";
    }
}
