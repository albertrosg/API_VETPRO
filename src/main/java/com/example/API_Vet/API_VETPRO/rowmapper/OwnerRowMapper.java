/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.API_Vet.API_VETPRO.rowmapper;

import com.example.API_Vet.API_VETPRO.models.Owner;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Albert
 */
public class OwnerRowMapper implements RowMapper<Owner>{

    @Override
    public Owner mapRow(ResultSet rs, int rowNum) throws SQLException {
        Owner owner = new Owner();
        owner.setOwnerId(rs.getInt("owner_id"));
        owner.setDni(rs.getString("dni"));
        owner.setName(rs.getString("name"));
        owner.setSurname(rs.getString("surname"));
        owner.setEmail(rs.getString("email"));
        owner.setPhoneNumber(rs.getString("phone_number"));
        owner.setAddress(rs.getString("phone_number"));
        return owner;
    }
    
}
