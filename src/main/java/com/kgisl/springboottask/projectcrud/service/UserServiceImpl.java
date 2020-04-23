
package com.kgisl.springboottask.projectcrud.service;

import java.util.List;

import javax.transaction.Transactional;

import com.kgisl.springboottask.projectcrud.entity.User;
import com.kgisl.springboottask.projectcrud.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;


    public User createUser(User username) {
        User u=new User();
    
       String use=username.getemail();
    boolean isExists = userRepository.existsByemail(use);
 
    if (!isExists) {
        u.setname(username.getname());
                u.setemail(username.getemail());
                u.setpassword(username.getpassword());
        return userRepository.save(u);
            }
    return null;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User findByUserId(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Not found"));
    }

    public User updateUser(Long id,User user) {
        User u = userRepository.getOne(id);
        u.setname(user.getname());
        return userRepository.save(u);
    }

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }


 public User Userlogin(User user) {
     int log;
        User result= new User();
        String name=user.getname();
        String password=user.getpassword();
        // String email=user.getemail();
        boolean isExists = userRepository.existsBynameAndPassword(name,password);
        if (!isExists) {
           result=null;
            }
            else{
               log=1; 
               result.setname(name);
               result.setpassword(password);
            }
            return result;
       
       
    }



}