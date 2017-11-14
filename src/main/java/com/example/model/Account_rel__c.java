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
    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    private Integer id;
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

