package com.example.jdbc_demo.services;

import com.example.jdbc_demo.entities.Portfolio;
import com.example.jdbc_demo.repos.JpaPortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RealPortfolioService implements PortfolioService {

    @Autowired
    private JpaPortfolioRepository jpaPortfolioRepository;

    @Override
    public List<Portfolio> getAllPortfolios() {
        return jpaPortfolioRepository.findAll();
    }

    @Override
    public Portfolio returnPortfolioById(Long id) {
        return jpaPortfolioRepository.getReferenceById(id);
    }

    @Override
    public void createPortfolio(Portfolio portfolio) {

    }
}
