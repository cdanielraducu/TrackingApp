package com.example.companyV2.controller;

import com.example.companyV2.model.Company;
import com.example.companyV2.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

public class LogInCompanyController {
    @Autowired
    CompanyRepository companyRepository;

    @PostMapping("loginCompany")
    public String addRegistration(@RequestParam String email,
                                  @RequestParam String password
    ){
        companyRepository.findByEmailContainingOrPasswordContaining(email,password);
        return "greeting";
    }
}
