package com.kanaex.springjpa.controller;

import com.kanaex.springjpa.model.UserRecord;
import com.kanaex.springjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/")
    public List<UserRecord> getAllUser(){
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/adduser", method = RequestMethod.POST)
    public void addUser(@RequestBody UserRecord userRecord){
        userService.addUser(userRecord);
    }
}
