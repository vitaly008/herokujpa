package com.example.model;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "account",schema="salesforce")
public class Account implements java.io.Serializable {
    public Account(){

    }
    public Account(String name){
        this.name=name;

    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String name;
    @Column(name="sfid")
    private String sfid;
    @OneToMany(mappedBy = "account", targetEntity=AccountRel.class)
    private Set<AccountRel> accr;
    public String getSfid() {
        return sfid;
    }
    public void setSfid(String sfid) {
        this.sfid = sfid;
    }
    public Set<AccountRel> getAccr() {
        return accr;
    }
    public void setAccr(Set<AccountRel> accr) {
        this.accr = accr;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

}

