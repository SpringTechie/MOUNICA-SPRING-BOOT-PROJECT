package com.springtechie.impl;

import com.springtechie.models.User;
import com.springtechie.repos.UserRepository;
import com.springtechie.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUser(int id) {
        log.info("UserServiceImpl Requested id = {}",id);
        log.error("UserServiceImpl Hello");
        log.warn("UserServiceImpl warn log");
        log.debug("UserServiceImpl debug");
        Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.orElse(null);

    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public String saveUser(User user) {
        userRepository.save(user);
        return "Created User Successfully";
    }

    @Override
    public String deleteUser(int id) {
        userRepository.deleteById(id);
        return "Deleted User Successfully";
    }

    @Override
    public String updateUser(User user) {
        userRepository.save(user);
        return "Updated User Successfully";
    }
}
