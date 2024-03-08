package com.dea.group12.service;

import com.dea.group12.model.User;

import java.util.List;

public interface UserService {
    User save(User user);

    List<User> findAllUsers();

    User updateUser(User user);
    void deleteUser(int id);
    User findByEmail(String email);


}
