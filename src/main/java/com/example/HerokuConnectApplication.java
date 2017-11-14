package com.example;

import com.example.dao.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.*;
import java.sql.*;
import java.util.*;
import java.net.URISyntaxException;
import java.net.URI;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.context.annotation.ImportResource;
import com.example.model.Account;


@Controller
@SpringBootApplication
@EnableAutoConfiguration
@ImportResource("classpath:applicationContext.xml")
public class HerokuConnectApplication {


    @Autowired
    AccountRepository accountRepository;

    @RequestMapping("/")
    public String home(Model model) {
        return "home";
    }

	@RequestMapping("/accounts")
    public String contacts(Model model) {
        try {
            AccountRepository repo = getAccountRepository();
            List<Account> contacts = null;

            if(repo != null) {
                contacts = (List<Account>) repo.findAll();
                model.addAttribute("contacts", contacts);
            }
            return "account";
        } catch (Exception e) {
            model.addAttribute("accounts", new LinkedList());
            e.printStackTrace();
        }
        return "account";
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



    private AccountRepository getAccountRepository() {

        return accountRepository;
    }

	public static void main(String[] args) {
		SpringApplication.run(HerokuConnectApplication.class, args);
	}
}
