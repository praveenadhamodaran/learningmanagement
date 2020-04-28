package com.kgisl.springboottask.projectcrud.entity;

// import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
// import javax.persistence.JoinColumn;
// import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long resid;
 
    private String resName;
    private String resType;
    private String url;
    private String tech;


    // @ManyToOne(cascade = CascadeType.ALL)
	// @JoinColumn(name = "id", updatable = false, insertable = true)
	// private User user;


    public Long getResid() {
        return resid;
    }

    public void setResid(Long resid) {
        this.resid = resid;
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    public String getResType() {
        return resType;
    }

    public void setResType(String resType) {
        this.resType = resType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

	public Resource(Long resid, String resName, String resType, String url, String tech) {
		this.resid = resid;
		this.resName = resName;
		this.resType = resType;
		this.url = url;
		this.tech = tech;
	}

    public Resource() {
    }

	

    
}