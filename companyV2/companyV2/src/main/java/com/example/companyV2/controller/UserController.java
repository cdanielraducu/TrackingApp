package com.example.companyV2.controller;

import com.example.companyV2.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //
public class UserController {

    @GetMapping("/user")
    public User getUser(@RequestParam (value = "firstName", defaultValue = "Dani") String firstName,
                        @RequestParam (value = "lastName", defaultValue = "Raducu") String lastName,
                        @RequestParam (value = "age", defaultValue = "20") int age) {
        User user = new User();

        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(age);

        return user;
    }

    @PostMapping("/user")
    public User postUser(User user) {

        System.out.println(user.getFirstName());

        return user;
    }

}
