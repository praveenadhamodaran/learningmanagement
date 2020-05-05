package com.kgisl.springboottask.projectcrud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "usrres")
 @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class UserResource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long userResId;
    private Long userId;
    private Long resId;
  

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getResId() {
        return resId;
    }

    public void setResId(Long resId) {
        this.resId = resId;
    }

    public Long getUserResId() {
        return userResId;
    }

    public void setUserResId(Long userResId) {
        this.userResId = userResId;
    }

    public UserResource() {
    }

    public UserResource(Long userId, Long resId, Long userResId) {
        this.userId = userId;
        this.resId = resId;
        this.userResId = userResId;
    }
    


}