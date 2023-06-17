package com.example.greeting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam("country") String country, Model model) {

//        boolean country = true;
        if (country.equals("ja")) {
            model.addAttribute("message", "こんにちは 世界!");
        } else if (country.equals("us")) {
            model.addAttribute("message", "hello world!");
        }

        return "hello";
    }
}
