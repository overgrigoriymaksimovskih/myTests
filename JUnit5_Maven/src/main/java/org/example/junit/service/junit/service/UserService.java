package org.example.junit.service.junit.service;

import org.example.junit.service.junit.DTO.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserService {

    private final List<User> users = new ArrayList<>();
    public List<User> getAll() {
        return users;
    }
    public boolean add (User user){
        return users.add(user);
    }
}
