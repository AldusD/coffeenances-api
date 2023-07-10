package com.coffeenances.api.controllers;

import com.coffeenances.api.models.User;
import com.coffeenances.api.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
//    @Autowired
//    UserService service;
//
//    @GetMapping("")
//    public ResponseEntity<List<User>> getUsers () {
//        List<User> users = service.sendUsers();
//        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
//    }
//
//    @PostMapping("")
//    public ResponseEntity<String> postUser (@Valid @RequestBody User user) throws Exception {
//        User newUser = service.createUser(user);
//        return new ResponseEntity<>(String.format("User created with id %d", newUser.getId()), HttpStatus.CREATED);
//    }
}
