/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.API_Vet.API_VETPRO.repository;

import com.example.API_Vet.API_VETPRO.models.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Albert
 */
@Repository
public interface OwnerRepository extends CrudRepository<Owner, Integer>{
    
}
