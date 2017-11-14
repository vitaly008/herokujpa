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
    @Column(name="sid")
    private String sid;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    private String name;
    @ManyToOne
    @JoinColumn(name="account_id", nullable=false)
    private Account acc;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    @Id
    @Column(name = "arel_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    public void setAcc(Account acc) {
        this.acc = acc;
    }
    public String getName() {
        return name;
    }
    public Account getAcc() {
        return acc;
    }

    public void setName(String name) {
        this.name = name;
    }
}

