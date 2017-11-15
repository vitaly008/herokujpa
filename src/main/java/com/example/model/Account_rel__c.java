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

    public String getSid() {
        return sid;
    }

    public void setSid(String sfid) {
        this.sid = sfid;
    }

    @Column(name="sid")
    private String sid;



    private String name;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @ManyToOne
    @JoinColumn(name="Account__c", nullable=false, referencedColumnName="sfid")
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

