package com.example.companyV2.controller;

import com.example.companyV2.Repositories.UserRepository;
import com.example.companyV2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/user")
    public List<User> index() {
        return userRepository.findAll();
    }

    @PostMapping("/user")
    public User create(@RequestBody Map<String, String> body){
        String cnp = body.get("cnp");
        String firstname = body.get("firstname");
        String lastname = body.get("lastname");
        String email = body.get("email");
        String password = body.get("password");

        return userRepository.save(new User(cnp,firstname, lastname, email, password));
    }

}

