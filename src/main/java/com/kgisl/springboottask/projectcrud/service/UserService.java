package com.kgisl.springboottask.projectcrud.service;

import java.util.List;

import com.kgisl.springboottask.projectcrud.entity.User;

public interface UserService {

    public User createUser(User username);
    public List<User> getUser();
    public User findByUserId(Long id);
    public User updateUser(Long id,User username);
    public void deleteUserById(Long id); 
     public User Userlogin(User uname);

}