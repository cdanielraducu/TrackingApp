package com.example.companyV2.controller;

import com.example.companyV2.repositories.UserRepository;
import com.example.companyV2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/allusers")
    public String allusers(Model m) {
        List <User> list;
        list = userRepository.findAll();
        m.addAttribute("list",list);

        return "allusers";
    }

    @GetMapping("/user")
    public String getUser(@ModelAttribute("user") User user) {

        return "user";
    }

    @PostMapping("/user")
    public String addRegistration(@RequestParam String cnp,
                                  @RequestParam String firstname,
                                  @RequestParam String lastname,
                                  @RequestParam String email,
                                  @RequestParam String password){

        /*String cnp = body.get("cnp");
        String firstname = body.get("firstname");
        String lastname = body.get("lastname");
        String email = body.get("email");
        String password = body.get("password");*/

        userRepository.save(new User(cnp,firstname, lastname, email, password));
        return  "redirect:user";
    }

}

