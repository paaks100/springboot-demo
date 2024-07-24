package com.example.jdbc_demo.services;

import com.example.jdbc_demo.entities.Portfolio;

import java.util.List;

public interface PortfolioService {
    List<Portfolio> getAllPortfolios();
    Portfolio returnPortfolioById(Long id);
    void createPortfolio(Portfolio portfolio);
}
