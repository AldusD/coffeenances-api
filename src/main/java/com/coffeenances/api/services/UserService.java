package com.coffeenances.api.services;

import com.coffeenances.api.models.User;
import com.coffeenances.api.exceptions.ResourceNotFoundException;
import com.coffeenances.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public List<User> sendUsers() {
        List<User> users = (List) repository.findAll();
        return  users;
    }

    public User sendUser (String email) throws Exception {
        User user = repository.findByEmail(email).orElseThrow(() -> {
            throw new ResourceNotFoundException("No user for giver email");
        });
        return user;
    }

    public User createUser (User user) throws Exception {
        User newUser = repository.save(user);
        return newUser;
    }
}
