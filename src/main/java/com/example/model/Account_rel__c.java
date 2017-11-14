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

    @Id
    @GeneratedValue
    private String name;
    @ManyToOne
    @JoinColumn(name="sfid", nullable=false)
    private Account acc;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

