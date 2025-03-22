package com.learning.user.ms.UserService.controllers;

import com.learning.user.ms.UserService.entities.User;
import com.learning.user.ms.UserService.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Inject
    private UserService userService;
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User user1 = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }
    @GetMapping("/{userId}")
    public ResponseEntity<User> getUser(@PathVariable String userId){
        User user = userService.getUser(userId);
        return ResponseEntity.ok(user);
    }
    @GetMapping
    public ResponseEntity<List<User>> getAllUser(){
        List<User> users = userService.getAllUser();
        return ResponseEntity.ok(users);
    }
}
