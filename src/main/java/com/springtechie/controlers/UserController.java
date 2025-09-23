package com.springtechie.controlers;

import com.springtechie.models.User;
import com.springtechie.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private UserService userService;

    @GetMapping("/get/user/id/{id}")
    public User fetchUser(int userId) {
        User user = userService.getUser(userId);
        return user;
    }

    @GetMapping("/get/users/")
    public List<User> fetchUsers(int userId) {
        List<User> users = userService.getUsers();
        return users;

    }
}
