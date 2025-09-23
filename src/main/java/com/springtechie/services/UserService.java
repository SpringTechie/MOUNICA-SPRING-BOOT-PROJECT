package com.springtechie.services;

import com.springtechie.models.User;

import java.util.List;

public interface UserService {
    User getUser(int id);
    List<User> getUsers();
    String saveUser(User user);
    String deleteUser(int id);
}
