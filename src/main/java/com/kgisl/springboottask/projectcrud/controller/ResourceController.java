package com.kgisl.springboottask.projectcrud.controller;

import java.util.List;

import com.kgisl.springboottask.projectcrud.service.ResourceService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.kgisl.springboottask.projectcrud.entity.Resource;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins = "*")
@EnableAspectJAutoProxy(proxyTargetClass = true)
@RestController
@RequestMapping("/res")

public class ResourceController {

    @Autowired
    private ResourceService resourceService;



    @GetMapping("/gres")
    public @ResponseBody ResponseEntity<List<Resource>> all() {
        return new ResponseEntity<>(resourceService.getResource(), HttpStatus.OK);
    }

    
    @PostMapping(value = "/pres", headers = "Accept=application/json")
    public ResponseEntity<Resource> createTeam(@RequestBody Resource resource) {
        Resource respost=resourceService.createResource(resource);
        HttpHeaders headers = new HttpHeaders();
        
        return new ResponseEntity<>(respost,headers, HttpStatus.CREATED);
    }

}