package com.webApp.eStore.controller;

import com.webApp.eStore.model.Tag;
import com.webApp.eStore.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class TagController {

    @Autowired
    public TagService service;

    @GetMapping("/tags")
    public List<Tag> getAllTags(){
        return service.getTags();
    }
}
