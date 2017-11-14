package com.example.model;



import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "account", schema="salesforce")//ame="document_collection", schema="document"
public class Account {
    public Account(){

    }
    public Account(String name,String shippingCity,String phone){
        this.name=name;
        this.shippingCity=shippingCity;
        this.phone=phone;
    }
    private Integer id;
    private String name;
    private String shippingCity;
    private String phone;

    public String getPhone() {
        return phone;
    }

    private String sfid;

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private Set<Account_rel__c> accr;

    public String getSfid() {
        return sfid;
    }

    public void setSfid(String sfid) {
        this.sfid = sfid;
    }
    @OneToMany( mappedBy = "account",fetch=FetchType.LAZY)
    public Set<Account_rel__c> getAccr() {
        return accr;
    }

    public void setAccr(Set<Account_rel__c> accr) {
        this.accr = accr;
    }

    @Column(name="createddate", insertable=true)
    @Temporal(TemporalType.TIMESTAMP)

    private Date createdDate;
    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getName() {
        return name;
    }

    public String getShippingCity() {
        return shippingCity;
    }





}

