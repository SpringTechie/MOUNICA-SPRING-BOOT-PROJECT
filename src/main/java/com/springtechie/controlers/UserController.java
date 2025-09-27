package com.springtechie.controlers;

import com.springtechie.impl.UserServiceImpl;
import com.springtechie.models.User;
import com.springtechie.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Value("${env}")
    private String env;

    // http://localhost:8080/get/user/id/1
    @GetMapping("/get/user/id/{id}")
    public User fetchUser(@PathVariable int id) {
        System.out.println(env);
        User user = userService.getUser(id);
        return user;
    }

    @GetMapping("/get/users/")
    public List<User> fetchUsers(int userId) {
        List<User> users = userService.getUsers();
        return users;

    }
}
