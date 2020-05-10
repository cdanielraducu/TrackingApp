package com.example.companyV2.repositories;

import com.example.companyV2.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
    List<Company> findByCUIContaining(String text);
}
