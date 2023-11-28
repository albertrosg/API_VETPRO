/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.API_Vet.API_VETPRO.service;

import com.example.API_Vet.API_VETPRO.models.Pet;
import java.util.ArrayList;
import org.springframework.stereotype.Service;

/**
 *
 * @author Albert
 */

@Service
public interface PetService {
    
    ArrayList<Pet> allPets();
    ArrayList<Pet> petByOwner(int owner_id);
    
}
