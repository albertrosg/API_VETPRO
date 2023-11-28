/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.API_Vet.API_VETPRO.service;

import java.util.Optional;
import com.example.API_Vet.API_VETPRO.models.Owner;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Albert
 */
@Service
public interface OwnerService {
    
    Optional<Owner> getUserById(int id);
    Owner updateOwner(Owner owner);
    Owner getOwnerByDni(String dni);
    
}
