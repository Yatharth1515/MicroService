package com.learning.user.ms.UserService.services;

import com.learning.user.ms.UserService.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;
public interface UserService {
    User saveUser(User user);

    // get all user

    List<User> getAllUser();
    // get single user
    User getUser(String userId);
}
