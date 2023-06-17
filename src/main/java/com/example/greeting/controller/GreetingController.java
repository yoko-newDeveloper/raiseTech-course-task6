package com.example.greeting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {
    @GetMapping("/hello")
    private String hello() {
        return "index";
    }
}
