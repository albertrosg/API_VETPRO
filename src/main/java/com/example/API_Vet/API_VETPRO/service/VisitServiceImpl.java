/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.API_Vet.API_VETPRO.service;

import com.example.API_Vet.API_VETPRO.models.Visit;
import com.example.API_Vet.API_VETPRO.repository.VisitRepository;
import com.example.API_Vet.API_VETPRO.rowmapper.VisitRowMapper;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

/**
 *
 * @author Albert
 */
@Service
public class VisitServiceImpl implements VisitService{
    
    @Autowired
    VisitRepository visitRepository;
    
    @Autowired
    JdbcTemplate template;

    @Override
    public List<Visit> getBusyHours(LocalDate date, int ownerId) {
        
        return (List<Visit>) template.query("select hour from visit where date = ? and user_id = ?", new VisitRowMapper(), new Object[] {date, ownerId});
        
    }
    
}
