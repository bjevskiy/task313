package ru.itmentor.spring.boot_security.demo.service;

import ru.itmentor.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    void updateUser(Long id, User user);

    void deleteUser(long id);

    List<User> getAllUsers();

    User getUserById(Long id);
    User getUserByName(String name);
}