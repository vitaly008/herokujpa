package com.example;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Set;

import com.example.dao.AccountRepository;
import com.example.model.Account;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration
@ImportResource("classpath:applicationContext.xml")
@RestController
public class AccountController {
    @Autowired
    AccountRepository repository;

    @RequestMapping(path = "/accounts",method = RequestMethod.GET)
    public Iterable<Account> getAccounts() {
        Iterable<Account> accounts = repository.findAll();
        return accounts;
    }


    private static Connection getConnection() throws URISyntaxException, SQLException {
        URI dbUri = new URI(System.getenv("DATABASE_URL"));

        String username = dbUri.getUserInfo().split(":")[0];
        String password = dbUri.getUserInfo().split(":")[1];
        String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':'
                + dbUri.getPort() + dbUri.getPath()
                + "?sslmode=require";

        return DriverManager.getConnection(dbUrl, username, password);
    }

    public static void main(String[] args) {
        SpringApplication.run(AccountController.class, args);
    }
}
