package com.kgisl.springboottask.projectcrud.controller;


import java.util.List;

import com.kgisl.springboottask.projectcrud.entity.Users;
// import com.kgisl.springbdd.entity.TeamDto;
import com.kgisl.springboottask.projectcrud.service.UserService;

// import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.util.UriComponentsBuilder;



@CrossOrigin(origins = "*")
@EnableAspectJAutoProxy(proxyTargetClass = true)
@RestController
@RequestMapping("/api/teams")
public class UserController {

   @Autowired
   private UserService userService;

   // @Autowired
   // private ModelMapper modelMapper;

   @PostMapping(value = "/", headers = "Accept=application/json")
   public ResponseEntity<Users> createUser(@RequestBody Users user) {
       Users actualUser=userService.createUser(user);
       HttpHeaders headers = new HttpHeaders();
       // headers.setLocation(ucBuilder.path("/{id}").buildAndExpand(team.getTeamid()).toUri());
       return new ResponseEntity<>(actualUser,headers, HttpStatus.CREATED);
   }

   @GetMapping("/")
   public @ResponseBody ResponseEntity<List<Users>> all() {
       return new ResponseEntity<>(userService.getUsers(), HttpStatus.OK);
   }

   @GetMapping(value = "/{usrId}", produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity<Users> getUserById(@PathVariable("usrId") long usrId) {
       Users user = userService.findByUserId(usrId);
       if (user == null) {
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
           
       }
       return new ResponseEntity<>(user, HttpStatus.OK);
   }
   @PutMapping(value = "/{usrId}", headers="Accept=application/json")
   public ResponseEntity<Users> updateUser(@PathVariable("usrId") long usrId,@RequestBody Users currentUser)
{
       Users user=userService.updateUser(usrId,currentUser);
       return new ResponseEntity<>(user,HttpStatus.OK);
   }

   @DeleteMapping(value="/{usrId}", headers ="Accept=application/json")
   public ResponseEntity<Users> deleteUser(@PathVariable("usrId") Long usrId){
       Users user = userService.findByUserId(usrId);
       if (user == null) {
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
       userService.deleteUserById(usrId);
       return new ResponseEntity<>(HttpStatus.NO_CONTENT);
   }



   @PostMapping(value = "/login", headers = "Accept=application/json")
   public ResponseEntity<Users> getUserlogin(@RequestBody Users username) {
    Users user=userService.Userlogin(username);
    //    HttpHeaders headers = new HttpHeaders();
    //    // headers.setLocation(ucBuilder.path("/{id}").buildAndExpand(team.getTeamid()).toUri());
    //    return new ResponseEntity<>(user,headers, HttpStatus.FORBIDDEN);
    if (user == null) {
        return new ResponseEntity<>(HttpStatus.FORBIDDEN);
    }
    return new ResponseEntity<>(user, HttpStatus.OK);
   }



}