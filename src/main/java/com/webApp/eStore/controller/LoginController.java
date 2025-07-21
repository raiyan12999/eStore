package com.webApp.eStore.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping("/login")
    public String login(){
        return "This is a login page";
    }

    @RequestMapping("/about")
    public String about(){
        return "This is the about page";
    }


}
