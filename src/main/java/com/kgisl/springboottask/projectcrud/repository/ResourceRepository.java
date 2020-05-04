package com.kgisl.springboottask.projectcrud.repository;

import java.io.Serializable;

import com.kgisl.springboottask.projectcrud.entity.Resource;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Serializable> {

}