package com.example.greeting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    @GetMapping("/hello-rest")
    public String hello() {
        return "hello world";
    }
}
