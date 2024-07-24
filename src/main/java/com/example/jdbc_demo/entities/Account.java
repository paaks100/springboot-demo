package com.example.jdbc_demo.entities;

public class Account {
    private final int id;
    private final String name;
    private final Double balance;

    public Account(int id, String name, Double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getBalance() {
        return balance;
    }
}
