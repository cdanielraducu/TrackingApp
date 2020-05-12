package com.example.companyV2.repositories;

import com.example.companyV2.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends CrudRepository<Company, Integer> {

    List<Company> findByCUIContaining(String text);


    List<Company> findByEmailContainingOrPasswordContaining(String searchTerm, String searchTerm1);
}
