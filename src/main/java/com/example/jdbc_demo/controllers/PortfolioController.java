package com.example.jdbc_demo.controllers;

import com.example.jdbc_demo.entities.Portfolio;
import com.example.jdbc_demo.services.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/portfolios")
public class PortfolioController {

    @Autowired
    private PortfolioService portfolioService;

    public List<Portfolio> getPortfolios() {
        return portfolioService.getAllPortfolios();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void postPortfolio(@RequestBody Portfolio portfolio){
        portfolioService.createPortfolio(portfolio);
    }
}
