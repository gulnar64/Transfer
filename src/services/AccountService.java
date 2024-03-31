package services;

import entities.Account;
import entities.User;

import java.util.List;
import java.util.Map;

public interface AccountService {
    void addAccount(Account account);
    Map<User, List<Account>> getAccounts();
}
