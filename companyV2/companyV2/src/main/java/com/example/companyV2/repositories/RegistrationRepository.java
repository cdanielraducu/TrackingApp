package com.example.companyV2.repositories;

import com.example.companyV2.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface RegistrationRepository extends JpaRepository <Company, Integer> {

    List<Company> findByCUIContaining(String text);
}
