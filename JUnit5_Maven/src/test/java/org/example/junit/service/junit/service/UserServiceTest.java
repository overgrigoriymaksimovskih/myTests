package org.example.junit.service.junit.service;

import org.example.junit.service.junit.DTO.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {
    private UserService userService;

    @BeforeEach
    void prepare(){
        System.out.println("Before each " + this);
        userService = new UserService();
    }

    @Test
    void usersEmptyIfNoUsersAdded (){
        System.out.println("Test 1 " + this);
        List<User> users = userService.getAll();
        assertTrue(users.isEmpty(), "User list sould be emty");
    }

    @Test
    void usersSizeIfUsersAdded () {
        System.out.println("Test 2 " + this);

        userService.add(new User());
        userService.add(new User());
        List<User> users = userService.getAll();

        assertEquals(2,users.size());
    }
    @AfterEach
    void deleteDateFromDatabase(){
        System.out.println("Somebody code after each test...");
    }
}
