package com.springtechie.impl;

import com.springtechie.models.User;
import com.springtechie.repos.UserRepository;
import com.springtechie.services.UserService;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    @Override
    public User getUser(int id) {
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
        return "Saved User Successfully";
    }

    @Override
    public String deleteUser(int id) {
        userRepository.deleteById(id);
        return "Deleted User Successfully";
    }
}
