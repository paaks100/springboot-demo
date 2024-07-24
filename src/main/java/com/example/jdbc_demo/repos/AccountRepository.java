package com.example.jdbc_demo.repos;

import com.example.jdbc_demo.entities.Account;

import java.util.List;

public interface AccountRepository {
    List<Account> getAllAccounts();
    Account findAccountById(int id);
    void saveAccount(Account account);
    void batchInsert(List<Account> accounts);
}