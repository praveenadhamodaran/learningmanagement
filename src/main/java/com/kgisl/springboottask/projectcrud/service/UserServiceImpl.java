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

    User user = new User();
    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User username) {
        String use=user.getUserEmail();
    boolean isExists = userRepository.existsByuserEmail(use);

    if (!isExists) {
        user.setUserName(user.getUserName());
                user.setUserEmail(user.getUserEmail());
                user.setUserPassword(user.getUserPassword());
                return userRepository.save(user);
        }
    return null;
    }

    @Override
    public List<User> getUser() {
        return userRepository.findAll();
    }

    @Override
    public User findByUserId(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Not found"));
    }

    @Override
    public User updateUser(Long id, User username) {
        User t = userRepository.getOne(id);
        t.setUserName(user.getUserName());
t.setUserEmail(user.getUserEmail());
        return userRepository.save(t);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);

    }

    @Override
    public User Userlogin(User uname) {
        int log;
        User result= new User();
        String name=user.getUserName();
        String password=user.getUserPassword();
        boolean isExists = userRepository.existsByuserNameAndUserPassword(name,password);
        if (!isExists) {
           result=null;
            }
            else{
                
               result.setUserName(name);
               result.setUserPassword(password);
            }
            return result;
       
       
    }

    
}