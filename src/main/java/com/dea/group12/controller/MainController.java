package com.dea.group12.controller;
import com.dea.group12.model.LoginRequest;
import com.dea.group12.service.UserService;
import com.dea.group12.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User addStudent(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping("/test")
    public String testConnection() {
        return "Connection OK!";
    }

    @GetMapping("/all") // New endpoint to get all users
    public List<User> getAllUsers() {
        return userService.findAllUsers();
    }

    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User user) {
        user.setId(id);
        return userService.updateUser(user);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginDTO) {
        User user = userService.findByEmail(loginDTO.getEmail());
        if (user != null && user.getPassword().equals(loginDTO.getPassword())) {
            return "Login successful";
        } else {
            return "Invalid credentials";
        }
    }
}
