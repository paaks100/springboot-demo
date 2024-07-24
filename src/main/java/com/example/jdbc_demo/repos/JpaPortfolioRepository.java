package com.example.jdbc_demo.repos;

import com.example.jdbc_demo.entities.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JpaPortfolioRepository extends JpaRepository<Portfolio, Long> {
    List<Portfolio> findAllPortfoliosByName(String name);
}
