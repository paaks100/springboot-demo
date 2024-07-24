package com.example.jdbc_demo.services;

import com.example.jdbc_demo.entities.Account;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public interface AccountService {
    List<Account> retrieveAllAccounts();
    void createAccount(Account account);
    Account getAccountById(Long id);

}