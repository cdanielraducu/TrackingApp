package com.example.companyV2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingsController {

    @GetMapping("greeting")
    public String greeting (Map<String, String> model) {

        return "greeting";
    }

    @GetMapping("thyme")
    public String thyme (Map<String, String> model) {
        model.put("message", "Hello Thymeleaf");
        return "thyme";
    }
}
