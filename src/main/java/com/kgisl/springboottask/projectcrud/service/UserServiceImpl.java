
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

    public User createUser(User user) {
        List<User> ans=getUser();
        for (User demo : val) 
{ 
    System.out.println("the result res is"+demo.getmail());
    System.out.println("the result username  is"+username.getmail());
    if(demo.getmail().equals(username.getmail())){
        data=1;
break;
    }
    else{
        data=0;
    }
 
}
 
System.out.println("the result is"+data);
 
if(data==0){
        user.setUsername(username.getUsername());
        user.setmail(username.getmail());
        return userRepository.save(user);
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

}