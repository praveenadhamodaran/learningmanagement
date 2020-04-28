package com.kgisl.springboottask.projectcrud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long resId;
private String resName;
private String resType;
private String resTech;
private String resUrl;

public Long getResId() {
	return resId;
}
public void setResId(Long resId) {
	this.resId = resId;
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
public String getResTech() {
	return resTech;
}
public void setResTech(String resTech) {
	this.resTech = resTech;
}
public String getResUrl() {
	return resUrl;
}
public void setResUrl(String resUrl) {
	this.resUrl = resUrl;
}

public Resource() {
}

public Resource(Long resId, String resName, String resType, String resTech, String resUrl) {
    this.resId = resId;
    this.resName = resName;
    this.resType = resType;
    this.resTech = resTech;
    this.resUrl = resUrl;
}


}