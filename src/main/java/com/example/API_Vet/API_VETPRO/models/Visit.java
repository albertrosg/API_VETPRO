/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.API_Vet.API_VETPRO.models;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author Albert
 */
@Entity
public class Visit {
    
    @Column(name="hour")
    private LocalTime hour;
    
    @Column(name="date")
    private LocalDate date;
    
    @Column(name="user_id")
    private int userId;

    public Visit() {
    }

    public Visit(LocalTime hour, LocalDate date, int userId) {
        this.hour = hour;
        this.date = date;
        this.userId = userId;
    }

    public LocalTime getHour() {
        return hour;
    }

    public void setHour(LocalTime hour) {
        this.hour = hour;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    
    
}
