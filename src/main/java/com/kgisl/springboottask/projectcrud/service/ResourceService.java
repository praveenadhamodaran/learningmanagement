package com.kgisl.springboottask.projectcrud.service;

import java.util.List;
import com.kgisl.springboottask.projectcrud.entity.Resource;

public interface ResourceService {
    public List<Resource> getResource();

    public Resource createResource(Resource resource);
}