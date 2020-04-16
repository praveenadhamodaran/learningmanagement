package com.kgisl.springboottask.projectcrud.service;


import java.util.List;

import com.kgisl.springboottask.projectcrud.entity.User;


public interface UserService {

    public User createUser(User user);
    public List<User> getUsers();
    public User findByUserId(Long id);
    public User updateUser(Long id,User user);
    public void deleteUserById(Long id); 
    
    // public void loginValidation(String name,String password);

}