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
   


    public String getSfid() {
        return sfid;
    }

    public void setSfid(String sfid) {
        this.sfid = sfid;
    }

    @Column(name="sfid")
    private String sfid;



    private String name;





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

