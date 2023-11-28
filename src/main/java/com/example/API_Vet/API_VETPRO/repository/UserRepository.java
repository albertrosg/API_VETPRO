/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.API_Vet.API_VETPRO.repository;

import com.example.API_Vet.API_VETPRO.models.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Albert
 */
public interface UserRepository extends CrudRepository<User, Integer>{
    
}
