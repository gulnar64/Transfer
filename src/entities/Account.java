package entities;

import enums.AccountStatus;

public class Account {
    private int id;    private String account;
    private User user;
    private double balance;
    private AccountStatus accountStatus;

    public Account(int id, String account, User user, double balance) {
        this.id = id;
        this.account = account;
        this.user = user;
        this.balance = balance;
        this.accountStatus = AccountStatus.OPEN;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }
}
