/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.API_Vet.API_VETPRO.rowmapper;

import com.example.API_Vet.API_VETPRO.models.Pet;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Albert
 */
public class PetRowMapper implements RowMapper<Pet>{

    @Override
    public Pet mapRow(ResultSet rs, int rowNum) throws SQLException {
        Pet pet = new Pet();
        pet.setChipNumber(rs.getString("chip_number"));
        pet.setName(rs.getString("name"));
        pet.setType(rs.getString("type"));
        pet.setSex(rs.getString("sex"));
        pet.setWeight(rs.getDouble("weight"));
        pet.setBirthDate(null);
        return pet;
    }
    
}
