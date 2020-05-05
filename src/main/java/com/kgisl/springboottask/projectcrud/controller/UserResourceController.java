package com.kgisl.springboottask.projectcrud.controller;

import java.util.List;

import com.kgisl.springboottask.projectcrud.entity.UserResource;
import com.kgisl.springboottask.projectcrud.service.UserResourceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@EnableAspectJAutoProxy(proxyTargetClass = true)
@RestController
@RequestMapping("/userres")

public class UserResourceController {
    
    @Autowired
    private UserResourceService userResourceService;

    @GetMapping("/guserres")
    public @ResponseBody ResponseEntity<List<UserResource>> all() {
        return new ResponseEntity<>(userResourceService.getUserResource(), HttpStatus.OK);
    }

    
    @PostMapping(value = "/puserres", headers = "Accept=application/json")
    public ResponseEntity<UserResource> createTeam(@RequestBody UserResource userResource) {
        UserResource urpost=userResourceService.createUserResource(userResource);
        HttpHeaders headers = new HttpHeaders();
        
        return new ResponseEntity<>(urpost,headers, HttpStatus.CREATED);
    }

}