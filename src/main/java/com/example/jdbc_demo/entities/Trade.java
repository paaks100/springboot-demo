package com.example.jdbc_demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Entity
public class Trade implements Serializable {

    private enum Side{BUY, SELL};

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ticker;
    private Double price;
    private Integer volume;
    private Side side;

    public Trade() {}

    public Trade(Long id, String ticker, Double price, Integer volume, Side side) {
        this.id = id;
        this.ticker = ticker;
        this.price = price;
        this.volume = volume;
        this.side = side;
    }

    public Long getId() {
        return id;
    }

    public String getTicker() {
        return ticker;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getVolume() {
        return volume;
    }

    public Side getSide() {
        return side;
    }
}
