package com.kgisl.springboottask.projectcrud.repository;

import com.kgisl.springboottask.projectcrud.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long>{

    boolean existsByemail(String use);
    boolean existsBynameAndEmail(String name,String email);
    
}