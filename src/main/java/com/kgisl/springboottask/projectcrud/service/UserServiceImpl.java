
package com.kgisl.springboottask.projectcrud.service;

import java.util.List;

import javax.transaction.Transactional;

import com.kgisl.springboottask.projectcrud.entity.Users;
import com.kgisl.springboottask.projectcrud.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;


    public Users createUser(Users username) {
        Users u=new Users();
    
       String use=username.getUseremail();
    boolean isExists = userRepository.existsByuseremail(use);
 
    if (!isExists) {
        u.setUsername(username.getUsername());
                u.setUseremail(username.getUseremail());
                u.setUserpassword(username.getUserpassword());
        return userRepository.save(u);
            }
    return null;
    }

    public List<Users> getUsers() {
        return userRepository.findAll();
    }

    public Users findByUserId(Long usrId) {
        return userRepository.findById(usrId).orElseThrow(() -> new IllegalArgumentException("Not found"));
    }

    public Users updateUser(Long usrId,Users user) {
        Users u = userRepository.getOne(usrId);
        u.setUsername(user.getUsername());
        return userRepository.save(u);
    }

    public void deleteUserById(Long usrId) {
        userRepository.deleteById(usrId);
    }


 public Users Userlogin(Users user) {
     int log;
        Users result= new Users();
        String name=user.getUsername();
        String password=user.getUserpassword();
        // String email=user.getemail();
        boolean isExists = userRepository.existsByusernameAnduserpassword(name,password);
        if (!isExists) {
           result=null;
            }
            else{
               log=1; 
               result.setUsername(name);
               result.setUserpassword(password);
            }
            return result;
       
       
    }



}