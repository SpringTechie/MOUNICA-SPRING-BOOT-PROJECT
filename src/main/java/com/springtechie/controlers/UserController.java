package com.springtechie.controlers;

import com.springtechie.models.User;
import com.springtechie.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/get/user/id/{id}")
    public User fetchUser(@PathVariable int id) {
        log.info("UserController Requested id = {}",id);
        log.error("UserController Hello");
        log.warn("UserController warn log");
        log.debug("UserController debug");
        return userService.getUser(id);
    }

    @GetMapping("/get/users/")
    public List<User> fetchUsers() {
        return userService.getUsers();
    }

    @PostMapping("/user/save")
    public String createUser(@RequestBody User user) {
      return userService.saveUser(user);
    }

    @PutMapping("/user/update")
    public String updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/user/delete")
    public String updateUser(@RequestParam(name = "userId",required = false) int id) {
        return userService.deleteUser(id);
    }
}
