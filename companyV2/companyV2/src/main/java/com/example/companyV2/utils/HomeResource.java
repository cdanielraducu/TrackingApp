package com.example.companyV2.utils;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String home() {
        return ("<h1>Welcome</h1>");
    }

    @GetMapping("/employer")
    public String user() {
        return ("<h1>Welcome employer</h1>");
    }

    @GetMapping("/companyGreetings")
    public String company() {
        return ("<h1>Welcome company</h1>");
    }
}
