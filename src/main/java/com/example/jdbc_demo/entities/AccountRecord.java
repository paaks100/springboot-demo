package com.example.jdbc_demo.entities;

public record AccountRecord (
    int id,
    String name,
    double balance
) {
    public AccountRecord(int id, String name) {
        this(id, name, 0);
    }
}
