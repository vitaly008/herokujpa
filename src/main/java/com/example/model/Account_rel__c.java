package com.example.model;



import javax.persistence.*;


@Entity
@Table(name="Account_rel__c")
public class Account_rel__c {
    public Account_rel__c(){

    }
    public Account_rel__c(String name){
        this.name=name;
    }
    public Account_rel__c(String name,Account acc){
        this.name=name;
        this.acc=acc;
    }
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

