package com.kgisl.springboottask.projectcrud.repository;

import java.io.Serializable;

import com.kgisl.springboottask.projectcrud.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Serializable>{


	boolean existsByuserEmail(String use);

	boolean existsByuserNameAndUserPassword(String name, String password);


}