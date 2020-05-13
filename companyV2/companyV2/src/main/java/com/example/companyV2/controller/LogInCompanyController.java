package com.example.companyV2.controller;

import com.example.companyV2.model.Company;
import com.example.companyV2.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class LogInCompanyController {
    @Autowired
    CompanyRepository companyRepository;

    @GetMapping("loginCompany")
    public String getRegistration(@ModelAttribute("loginCompany") Company company) {

        return "loginCompany";
    }

    @PostMapping("loginCompany")
    public String addRegistration(@RequestParam String email,
                                  @RequestParam String password
    ){
        companyRepository.findByEmailContainingOrPasswordContaining(email,password);
        return "redirect:loginCompany";
    }
}
