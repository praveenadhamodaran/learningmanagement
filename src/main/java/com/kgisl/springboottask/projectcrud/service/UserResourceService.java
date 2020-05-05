package com.kgisl.springboottask.projectcrud.service;

import java.util.List;

import com.kgisl.springboottask.projectcrud.entity.UserResource;

public interface UserResourceService {
    
    public List<UserResource> getUserResource();

    public UserResource createUserResource(UserResource userResource);

}