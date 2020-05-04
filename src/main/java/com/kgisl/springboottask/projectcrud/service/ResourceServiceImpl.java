package com.kgisl.springboottask.projectcrud.service;

import java.util.List;

import javax.transaction.Transactional;

import com.kgisl.springboottask.projectcrud.entity.Resource;
import com.kgisl.springboottask.projectcrud.repository.ResourceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ResourceServiceImpl implements ResourceService {

    Resource resource = new Resource();
	
    @Autowired
    ResourceRepository resourceRepository;

	@Override
	public List<Resource> getResource() {
        return resourceRepository.findAll();
	}

	@Override
	public Resource createResource(Resource resource) {
                resource.setResId(resource.getResId());
        resource.setResName(resource.getResName());
        resource.setResType(resource.getResType());
        resource.setResUrl(resource.getResUrl());
        resource.setResTech(resource.getResTech());


         return resourceRepository.save(resource);
	}
}