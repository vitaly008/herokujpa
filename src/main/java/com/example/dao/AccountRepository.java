package com.example.dao;

import com.example.model.Account;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

    public List<Account> findById(Integer id);
    public List<Account> findAll();

}
