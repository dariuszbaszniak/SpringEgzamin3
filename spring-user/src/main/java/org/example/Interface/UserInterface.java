package org.example.Interface;

import org.example.Model.User;

import java.util.List;

public interface UserInterface {

    List<User> getUsers();
    void add(User user);
    void update(User user);
    void delete(Long id);
}
