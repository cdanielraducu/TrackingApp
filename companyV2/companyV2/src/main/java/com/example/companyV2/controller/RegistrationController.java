package com.example.companyV2.controller;

import com.example.companyV2.model.Company;
import com.example.companyV2.model.Registration;
import com.example.companyV2.model.User;
import com.example.companyV2.repositories.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class RegistrationController {

    @Autowired
    RegistrationRepository registrationRepository;

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("registration") Company company) {


        return "registration";
    }

    @PostMapping("registration")
    public String addRegistration(@RequestParam String CUI,
                                  @RequestParam String name,
                                  @RequestParam String email,
                                  @RequestParam String password
                                  ){
        registrationRepository.save(new Company(CUI,name,email, password));
         return "redirect:registration";
    }

    /*@PostMapping("registration")
    public String addRegistration(@RequestBody Map<String, String> body) {
        System.out.println(body);
        String CUI = body.get("cui");
        String name = body.get("name");
        String email = body.get("email");
        String password = body.get("password");

        System.out.print(CUI + " " + name + " "+email+ " "+ password);

        registrationRepository.save(new Company(CUI,name,email, password));
        //System.out.println("Registration: " + company.getName() + " avand CUI " + company.getCUI() + " cu adresa de mail " + company.getEmail()
        //+ " cu parola " + company.getPassword());

        return "redirect:registration";
    }*/
}
