package com.kgisl.springboottask.projectcrud.repository;

import java.io.Serializable;

import com.kgisl.springboottask.projectcrud.entity.UserResource;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserResourceRepository extends JpaRepository<UserResource, Serializable> {
    
}