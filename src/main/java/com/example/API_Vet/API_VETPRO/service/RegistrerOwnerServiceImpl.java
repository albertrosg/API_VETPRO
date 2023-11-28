/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.API_Vet.API_VETPRO.service;

import com.example.API_Vet.API_VETPRO.encrytion.SHAEncryption;
import com.example.API_Vet.API_VETPRO.models.RegistrerOwner;
import com.example.API_Vet.API_VETPRO.repository.RegistrerOwnerRepository;
import com.example.API_Vet.API_VETPRO.rowmapper.RegistrerOwnerRowMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Albert
 */
@Service
public class RegistrerOwnerServiceImpl implements RegistrerOwnerService{

    @Autowired
    RegistrerOwnerRepository registrerOwnerRepository;
    
    @Autowired
    JdbcTemplate template;
    
    
    @Override
    public RegistrerOwner updateRegistrerOwner(@RequestBody RegistrerOwner registrerOwner) {
        
        return registrerOwnerRepository.save(registrerOwner);
        
    }

    @Override
    public List<RegistrerOwner> allRegistrerUser() {
        return (List<RegistrerOwner>) registrerOwnerRepository.findAll();
    }

    @Override
    public RegistrerOwner searchOwner(String userName, String password) {
        
        return template.queryForObject("select * from registrer_owner where password = ? and user_name=?", new RegistrerOwnerRowMapper(), new Object[] {password, userName});
        
    }

    
    
}
