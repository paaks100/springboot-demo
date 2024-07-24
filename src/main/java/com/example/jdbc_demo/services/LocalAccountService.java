package com.example.jdbc_demo.services;

import com.example.jdbc_demo.entities.Account;
import com.example.jdbc_demo.repos.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalAccountService implements AccountService {

    private AccountRepository accountRepository;

    public LocalAccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<Account> retrieveAllAccounts() {
        System.out.println("LocalAccountService retrieving all accounts");
        return accountRepository.getAllAccounts();
    }

    @Override
    public void createAccount(Account account) {

    }

    @Override
    public Account getAccountById(Long id) {
        return null;
    }
}