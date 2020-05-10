package com.example.companyV2.controller;

import com.example.companyV2.model.Company;
import com.example.companyV2.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class RegistrationController {

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("registration") Company company) {


        return "registration";
    }

    @PostMapping("registration")
    public String addRegistration(@ModelAttribute("registration") Company company) {

        System.out.println("Registration: " + company.getName() + " avand CUI " + company.getCUI() + " cu adresa de mail " + company.getEmail()
        + " cu parola " + company.getPassword());

        return "redirect:registration";
    }
}
