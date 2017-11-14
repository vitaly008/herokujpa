package com.example.model;



import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Person entity
 *
 * @author Rajdeep Dua
 */
@Entity
@Table(name = "account", schema="salesforce")//ame="document_collection", schema="document"
public class Account {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String shippingCity;
    private String email;
    private String sfid;

    public String getSfid() {
        return sfid;
    }

    public void setSfid(String sfid) {
        this.sfid = sfid;
    }

    public Set<Account_rel__c> getAccr() {
        return accr;
    }

    public void setAccr(Set<Account_rel__c> accr) {
        this.accr = accr;
    }

    @Column(name="createddate", insertable=true)
    @Temporal(TemporalType.TIMESTAMP)

    @OneToMany(mappedBy="account")
    private Set<Account_rel__c> accr;
    private Date createdDate;

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

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public String getEmail() {
        return email;
    }



}

