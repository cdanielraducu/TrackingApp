package com.example.companyV2.controller;

import com.example.companyV2.model.Registration;
import com.example.companyV2.model.User;
import com.example.companyV2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.UnsatisfiedServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

@Controller //
public class UserController {

    /*@GetMapping("/user")
    public User getUser(@RequestParam (value = "firstName", defaultValue = "Dani") String firstName,
                        @RequestParam (value = "lastName", defaultValue = "Raducu") String lastName,
                        @RequestParam (value = "cnp", defaultValue = "2020352584455") String cnp,
                        @RequestParam (value = "email", defaultValue = "dani.raducu") String email,
                        @RequestParam (value = "pass", defaultValue = "pass123") String pass,
                        @RequestParam (value = "dataAng", defaultValue = "pss") String dataAng) {
        User user = new User();

        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setCnp(cnp);
        user.setEmail(email);
        user.setPass(pass);
        user.setDataAng(dataAng);


        return user;
    }
*/

    @Autowired
    UserRepository userRepository;

    @GetMapping("user")
    public String getRegistration(@ModelAttribute("user") User user){


        return "user";
    }

    @PostMapping("/user")
    public String addUser(@ModelAttribute("user") User user) {

        System.out.println(user.getFirstName() + " " + user.getLastName() + user.getCnp());

        return "redirect:user";
    }

}
