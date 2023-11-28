/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.API_Vet.API_VETPRO.rowmapper;

import com.example.API_Vet.API_VETPRO.models.Visit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Albert
 */
public class VisitRowMapper implements RowMapper<Visit>{

    @Override
    public Visit mapRow(ResultSet rs, int rowNum) throws SQLException {
        Visit visit = new Visit();
        visit.setDate((LocalDate) rs.getObject("date"));
        visit.setHour((LocalTime) rs.getObject("hour"));
        visit.setUserId(rs.getInt("user_id"));
        return visit;
    }
    
    
}
