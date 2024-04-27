package com.dea.group12.controller;

import com.dea.group12.model.LoginRequest;
import com.dea.group12.model.User;
import com.dea.group12.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")

//handle cors issues
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public String testConnection() {
        return "Connection OK!";
    }

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.findAllUsers();
    }

    @PutMapping("/edit/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User user) {
        user.setId(id);
        return userService.updateUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
    }

    //login method
    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody LoginRequest loginDTO) {
        //find user by email
        User user = userService.findByEmail(loginDTO.getEmail());
        Map<String, Object> response = new HashMap<>();

        //check password is matched or not
        if (user != null && user.getPassword().equals(loginDTO.getPassword())) {
            response.put("message", "Login successful");
            response.put("user", user);
        } else {
            response.put("message", "Invalid credentials");
        }
        return response;
    }
}
