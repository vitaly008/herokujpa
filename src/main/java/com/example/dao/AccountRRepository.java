package com.example.dao;

import com.example.model.Account;
import com.example.model.Account_rel__c;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRRepository extends CrudRepository<Account_rel__c, Long> {

    public List<Account_rel__c> findById(Integer id);
    public List<Account_rel__c> findAll();

}
