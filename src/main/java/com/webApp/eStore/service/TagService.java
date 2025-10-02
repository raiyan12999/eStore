package com.webApp.eStore.service;

import com.webApp.eStore.repository.TagRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagService {

    @Autowired
    public TagRepo repo;
}
