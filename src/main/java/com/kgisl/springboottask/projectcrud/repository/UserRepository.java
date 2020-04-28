package com.kgisl.springboottask.projectcrud.repository;

import com.kgisl.springboottask.projectcrud.entity.Users;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<Users,Long>{

    boolean existsByuseremail(String use);
    boolean existsByusernameAnduserpassword(String username,String userpassword);
    
}