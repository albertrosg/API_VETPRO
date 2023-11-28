/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.API_Vet.API_VETPRO.service;

import com.example.API_Vet.API_VETPRO.models.Pet;
import com.example.API_Vet.API_VETPRO.repository.PetRepository;
import com.example.API_Vet.API_VETPRO.rowmapper.PetRowMapper;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 *
 * @author Albert
 */
@Service
public class PetServiceImpl implements PetService{
    
    @Autowired
    PetRepository petRepository;
    
    @Autowired
    JdbcTemplate template;

    @Override
    public ArrayList<Pet> allPets() {
        return (ArrayList<Pet>) petRepository.findAll();
    }

    @Override
    public ArrayList<Pet> petByOwner(int owner_id) {
        return (ArrayList<Pet>)template.query("select * from pet where owner_id = ?", new PetRowMapper(), new Object [] {owner_id});
    }
    
}
