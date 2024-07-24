package com.example.jdbc_demo.repos;

import com.example.jdbc_demo.entities.Account;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LocalAccountRepository implements AccountRepository{
    private List<Account> accounts = new ArrayList<>();

    public LocalAccountRepository() {
        this.accounts.add(new Account(1, "Claire", 20.00));
        this.accounts.add(new Account(2, "Mike", 500.00));
        this.accounts.add(new Account(3, "Enock", 350.00));
    }

    @Override
    public List<Account> getAllAccounts() {
        return accounts;
    }

    @Override
    public Account findAccountById(int id) {
        return accounts.stream().filter(a->a.getId()==id).findFirst().get();
    }

    @Override
    public void saveAccount(Account account) {
        accounts.add(account);
    }

    @Override
    public void batchInsert(List<Account> accounts) {
        this.accounts.addAll(accounts);
    }
}