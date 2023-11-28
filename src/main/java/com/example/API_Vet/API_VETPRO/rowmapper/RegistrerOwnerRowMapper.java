/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.API_Vet.API_VETPRO.rowmapper;

import com.example.API_Vet.API_VETPRO.models.RegistrerOwner;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Albert
 */
public class RegistrerOwnerRowMapper implements RowMapper<RegistrerOwner>{

    @Override
    public RegistrerOwner mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegistrerOwner registrerOwner = new RegistrerOwner();
        registrerOwner.setOwnerId(rs.getInt("owner_id"));
        registrerOwner.setPassword(rs.getString("password"));
        registrerOwner.setUserName(rs.getString("user_name"));
        return registrerOwner;
    }
    
}
