package com.example.model;



import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "account", schema="salesforce")
public class Account {
    public Account(){

    }
    public Account(String name){
        this.name=name;

    }
    private Integer id;
    private String name;
    private String sfid;

    private Set<Account_rel__c> accr;
    public String getSfid() {
        return sfid;
    }
    public void setSfid(String sfid) {
        this.sfid = sfid;
    }
    @OneToMany(mappedBy = "account", targetEntity=Account_rel__c.class,
            fetch=FetchType.EAGER)
    public Set<Account_rel__c> getAccr() {
        return accr;
    }
    public void setAccr(Set<Account_rel__c> accr) {
        this.accr = accr;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }







}

