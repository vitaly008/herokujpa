package com.example.model;
import javax.persistence.*;


@Entity
@Table(name="Account_rel__c",schema="salesforce")
public class Account_rel__c implements java.io.Serializable {
    public Account_rel__c(){

    }
    public Account_rel__c(String name){
        this.name=name;
    }
    public Account_rel__c(String name,Account account){
        this.name=name;
        this.account=account;
    }

    public String getSfid() {
        return sfid;
    }

    public void setSfid(String sfid) {
        this.sfid = sfid;
    }

    @Column(name="sfid")
    private String sfid;



    private String name;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @ManyToOne
    @JoinColumn(name="Account_c", nullable=false)
    private Account account;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

}

