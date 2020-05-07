package com.example.companyV2.repositories;

import com.example.companyV2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {

    List <User> findByCnpContainingOrDataAngContaining(String text, String textAgain);


}
