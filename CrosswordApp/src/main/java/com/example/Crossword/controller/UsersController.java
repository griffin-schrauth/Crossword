package com.example.Crossword.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.Crossword.model.Users;
import com.example.Crossword.repository.UsersCollectionRepo;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/users")
public class UsersController {
    private final UsersCollectionRepo users;

    public UsersController(UsersCollectionRepo users) {
        this.users = users;
    }

   
    
    @GetMapping("")
    public List<Users> findAll(){
        return users.findAllUsers();
    }

}
