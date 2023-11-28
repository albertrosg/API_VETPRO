/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.API_Vet.API_VETPRO.service;

import java.util.Optional;
import com.example.API_Vet.API_VETPRO.models.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.API_Vet.API_VETPRO.repository.OwnerRepository;
import com.example.API_Vet.API_VETPRO.rowmapper.OwnerRowMapper;
import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Albert
 */
@Service
public class OwnerServiceImpl implements OwnerService{
    
    @Autowired
    OwnerRepository ownerRepository;
    
    @Autowired
    JdbcTemplate template;

    @Override
    public Optional<Owner> getUserById(int id) {
        
        return ownerRepository.findById(id);
        
    }

    @Override
    public Owner updateOwner(Owner owner) {
        
        return ownerRepository.save(owner);
        
    }

    @Override
    public Owner getOwnerByDni(String dni) {        
        
        return template.queryForObject("select * from owner where dni = ?", new OwnerRowMapper(), new Object[]{dni} );
        
    }
    
}
