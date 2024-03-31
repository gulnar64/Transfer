package services;

import entities.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    private final List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }
}
