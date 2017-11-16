package com.example.dao;

import com.example.model.Account;
import com.example.model.AccountRel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRRepository extends CrudRepository<AccountRel, Long> {

    public List<AccountRel> findById(Integer id);
    public List<AccountRel> findAll();

}
