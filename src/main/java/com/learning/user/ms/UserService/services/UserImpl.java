package com.learning.user.ms.UserService.services;

import com.learning.user.ms.UserService.entities.User;
import com.learning.user.ms.UserService.exceptions.ResourceNotFoundException;
import com.learning.user.ms.UserService.repositories.UserRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;
@Service
public class UserImpl implements UserService{

    @Inject
    private UserRepository userRepository;
    @Inject
    private KafkaService kafkaService;
    @Override
    public User saveUser(User user) {
        this.kafkaService.userDetails(user.getAbout());
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("user not found with given id :-" + userId));
    }
}
