package com.kgisl.springboottask.projectcrud.service;

import java.util.List;

import javax.transaction.Transactional;

import com.kgisl.springboottask.projectcrud.entity.UserResource;
import com.kgisl.springboottask.projectcrud.repository.UserResourceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserResourceServiceImpl implements UserResourceService {

    UserResource userResource = new UserResource();
	
    @Autowired
    private UserResourceRepository userResourceRepository;

    @Override
    public List<UserResource> getUserResource() {
        return userResourceRepository.findAll();
    }

    @Override
    public UserResource createUserResource(UserResource userResource) {
        userResource.setResId(userResource.getResId());
        userResource.setUserId(userResource.getUserId());
        userResource.setUserResId(userResource.getUserResId());
       
         return userResourceRepository.save(userResource);
    }
    
}