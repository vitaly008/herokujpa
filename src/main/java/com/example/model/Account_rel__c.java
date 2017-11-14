package com.example.model;



import javax.persistence.*;

/**
 * Person entity
 *
 * @author Rajdeep Dua
 */
@Entity
@Table(name="Account_rel__c")
public class Account_rel__c {

    private String name;
    private Account acc;

    public void setAcc(Account acc) {
        this.acc = acc;
    }
    public String getName() {
        return name;
    }
    @ManyToOne
    @JoinColumn(name="sfid", nullable=false)
    public Account getAcc() {
        return acc;
    }

    public void setName(String name) {
        this.name = name;
    }
}

