package com.example.model;
import javax.persistence.*;


@Entity
@Table(name="Account_rel__c",schema="salesforce")
public class AccountRel implements java.io.Serializable {
    public AccountRel(){

    }
    public AccountRel(String name){
        this.name=name;
    }
    public AccountRel(String name,Account account){
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
    @JoinColumn(name="account__c", nullable=false)
    private Account account;


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

}

