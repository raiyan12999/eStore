package com.webApp.eStore.controller;

import com.webApp.eStore.model.Tag;
import com.webApp.eStore.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "/tags", consumes = "application/json")
    public void addATag(@RequestBody Tag tag){
        service.addTag(tag);
    }
}
