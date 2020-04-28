package com.kgisl.springboottask.projectcrud.service;

import java.util.List;

import com.kgisl.springboottask.projectcrud.entity.Resource;
import com.kgisl.springboottask.projectcrud.repository.ResourceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
@Transactional
public class ResourceServiceImpl implements ResourceService {

    Resource res = new Resource();

    @Autowired
    private ResourceRepository resourceRepository;

    @Override
    public List<Resource> getResource() {
        return resourceRepository.findAll();
    }

    @Override
    public Resource createresource(Resource res) {
        res.setResName(res.getResName());
        res.setResType(res.getResType());
        res.setUrl(res.getUrl());
        res.setTech(res.getTech());


         return resourceRepository.save(res);
    }

}