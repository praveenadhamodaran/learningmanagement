package com.kgisl.springboottask.projectcrud.service;


import java.util.List;

import com.kgisl.springboottask.projectcrud.entity.Users;


public interface UserService {

    public Users createUser(Users user);
    public List<Users> getUsers();
    public Users findByUserId(Long userId);
    public Users updateUser(Long userId,Users user);
    public void deleteUserById(Long userId); 
    
    public Users Userlogin(Users user);
    // public void loginValidation(String name,String password);

}