package services;

import entities.Account;
import entities.User;
import exceptions.UserNotFound;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AccountServiceImpl implements AccountService{
    private final List<Account> accounts = new ArrayList<>();
    private final UserService userService = new UserServiceImpl();
    @Override
    public void addAccount(Account account) {
        checkUserExists(account.getUser());
        accounts.add(account);
    }

    private void checkUserExists(User user) {
        if(!userService.getUsers().contains(user))
            throw new UserNotFound(user);
    }

    @Override
    public Map<User, List<Account>> getAccounts() {
        return null;
    }
}
