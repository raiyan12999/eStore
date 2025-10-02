package com.webApp.eStore.service;

import com.webApp.eStore.model.Tag;
import com.webApp.eStore.repository.TagRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService {

    @Autowired
    public TagRepo repo;

    public List<Tag> getTags() {
        return repo.findAll();
    }
}
