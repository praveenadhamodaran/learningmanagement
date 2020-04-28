package com.kgisl.springboottask.projectcrud.entity;

// import com.kgisl.springboottask.projectcrud.entity.Resource;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long userId;
    private String username;
    private String useremail;
    private String userpassword;
    private String confirmpassword;


    @OneToMany
    @JsonIgnore
    private List<Resource> resource;
	
    
    public Users() {
    
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getConfirmpassword() {
        return confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }

    public List<Resource> getResource() {
        return resource;
    }

    public void setResource(List<Resource> resource) {
        this.resource = resource;
    }

    public Users(Long userId, String username, String useremail, String userpassword, String confirmpassword,
            List<Resource> resource) {
        this.userId = userId;
        this.username = username;
        this.useremail = useremail;
        this.userpassword = userpassword;
        this.confirmpassword = confirmpassword;
        this.resource = resource;
    }



  

   
}