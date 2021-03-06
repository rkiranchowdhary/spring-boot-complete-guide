package com.self.java;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    private static final String template = "Hello, %s!";

    @RequestMapping("/helloworld")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {

        return new Greeting(String.format(template, name));
    }
}