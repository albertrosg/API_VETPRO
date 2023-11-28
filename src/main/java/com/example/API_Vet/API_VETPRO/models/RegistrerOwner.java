/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.API_Vet.API_VETPRO.models;

import com.example.API_Vet.API_VETPRO.encrytion.SHAEncryption;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author Albert
 */
@Entity
@Table(name="registrer_owner", uniqueConstraints = {@UniqueConstraint(columnNames = "user_name")})
public class RegistrerOwner {
    
    @Id
    @Column(name="owner_id")
    private int ownerId;
    
    @Column(name="user_name")
    private String userName;
    
    @Column(name="password")
    private String password;

    public RegistrerOwner() {
    }
    
    

    public RegistrerOwner(int ownerId, String userName, String password) {
        this.ownerId = ownerId;
        this.userName = userName;
        this.password = new SHAEncryption().Sha256(password);
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }   

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
