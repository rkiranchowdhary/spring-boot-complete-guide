package com.self.java;

import javax.inject.Named;
import org.springframework.context.annotation.Scope;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Named
@Scope("request")
public class SimpleResourceImpl implements SimpleResource{

    private static final String template = "Hello, %s!";

    @Override
    public Response greet(String name) {
        return Response.ok(String.format(template, name), MediaType.TEXT_PLAIN).build();
    }
}