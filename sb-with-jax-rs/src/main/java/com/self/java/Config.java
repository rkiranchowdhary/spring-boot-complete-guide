package com.self.java;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class Config extends ResourceConfig{
    public Config() {
        packages("com.self.java");
    }
}