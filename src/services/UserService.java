package services;

import entities.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    List<User> getUsers();
}
