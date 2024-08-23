package com.example.Crossword.repository;

import org.springframework.stereotype.Repository;

import com.example.Crossword.model.Users;

import jakarta.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UsersCollectionRepo {

    private final List<Users> users = new ArrayList<>();

    public UsersCollectionRepo(){
    
    }

    public List<Users> findAllUsers(){
        return users;
    }

    public Optional<Users> findById(Integer id){
        return users.stream().filter(c -> c.id().equals(id)).findFirst();
    }

    @PostConstruct
    private void init(){
        Users u = new Users(1,"testingUser","testingUSer@gmail.com.invalid","testing123");
        users.add(u);
    }
}
