package com.example.jdbc_demo.entities;

public record Order (
        String product,
        Integer quantity,
        Double price,
        String side,
        String type
){
}