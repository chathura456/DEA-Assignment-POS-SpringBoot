package com.dea.group12.service;

import com.dea.group12.model.User;

import java.util.List;

public interface UserService {
    //user register
    User save(User user);

    //view all users
    List<User> findAllUsers();

    //user update
    User updateUser(User user);

    //delete user
    void deleteUser(int id);

    //user login
    User findByEmail(String email);
}
