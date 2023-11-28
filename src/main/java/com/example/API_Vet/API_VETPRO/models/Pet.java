/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.API_Vet.API_VETPRO.models;

import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Albert
 */

@Entity
public class Pet {
    
    
    @Id
    @Column(name="chip_number", unique = true)
    private String chipNumber;
    
    @Column(name="name")
    private String name;
    
    @Column(name="type")
    private String type;
    
    @Column(name="race")
    private String race;    
    
    @Column(name="weight")
    private double weight;
    
    @Column(name="birth_date")
    private LocalDate birthDate;
    
    @Column(name="sex")
    private String sex;
    
    /*@ManyToOne(cascade={CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name="owner_id")
    private Owner owner;*/

    public Pet() {
    }
/*
    public Pet(String chipNumber, String name, String type, String race, double weight, LocalDate birthDate, String sex, Owner owner) {
        this.chipNumber = chipNumber;
        this.name = name;
        this.type = type;
        this.race = race;
        this.weight = weight;
        this.birthDate = birthDate;
        this.sex = sex;
        this.owner = owner;
    }*/

    public String getChipNumber() {
        return chipNumber;
    }

    public void setChipNumber(String chipNumber) {
        this.chipNumber = chipNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
/*
    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }*/
    
    
}
