package com.example.greeting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class RestUsJpController {

    @GetMapping("/us-jp-hello")
    public String hello(@RequestParam(value = "country", required = false) String country) {

        // クエリ変数パスによって、レスポンスを出し分ける
        if (Objects.equals(country, "jp")) {
            return "こんにちは!";
        } else if (Objects.equals(country, "us")) {
            return "hello!";
        } else {
            // jp, us以外の場合は中国語で表示
            return "bonjour!";
        }
    }
}
