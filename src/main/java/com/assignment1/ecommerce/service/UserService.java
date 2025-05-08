package com.assignment1.ecommerce.service;

import com.assignment1.ecommerce.model.User;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    User createUser(User user);
    User updateUser(Long id, User userDetails);
    void deleteUser(Long id);
}