package com.example.companyV2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String CUI;
    private String name;
    private String email;
    private String password;

    public Company() {
    }

    public Company(String name, String CUI, String email, String password) {
        this.name = name;
        this.CUI = CUI;
        this.email = email;
        this.password = password;
    }

    public Company(int id, String name, String CUI, String email, String password) {
        this.id = id;
        this.name = name;
        this.CUI = CUI;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCUI() {
        return CUI;
    }

    public void setCUI(String CUI) {
        this.CUI = CUI;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
