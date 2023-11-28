/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.API_Vet.API_VETPRO.controllers;

import java.util.Optional;
import com.example.API_Vet.API_VETPRO.models.Owner;
import com.example.API_Vet.API_VETPRO.models.Pet;
import com.example.API_Vet.API_VETPRO.models.RegistrerOwner;
import com.example.API_Vet.API_VETPRO.models.User;
import com.example.API_Vet.API_VETPRO.models.Visit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.API_Vet.API_VETPRO.service.OwnerService;
import com.example.API_Vet.API_VETPRO.service.PetService;
import com.example.API_Vet.API_VETPRO.service.RegistrerOwnerService;
import com.example.API_Vet.API_VETPRO.service.UserService;
import com.example.API_Vet.API_VETPRO.service.VisitService;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Albert
 */

@RestController
@RequestMapping("api")
public class Ejemplo {
    
    @Autowired
    OwnerService ownerService;
    
    @Autowired
    PetService petService;
    
    @Autowired
    RegistrerOwnerService registrerOwnerService;
    
    @Autowired
    UserService userService;
    
    @Autowired
    VisitService visitService;
    
    
    @GetMapping("/getOwner/{id}")
    public Optional<Owner> getOwner(@PathVariable("id") Integer id){
        return ownerService.getUserById(id);
    }
    
    @PostMapping("/updateOwner")
    public Owner updateOwner(@RequestBody Owner owner){
        return ownerService.updateOwner(owner);
    }
    
    @GetMapping("/getAllPet")
    public ArrayList<Pet> getAllPet(){
        return petService.allPets();
    }

    @GetMapping("/getOwnerDni/{dni}")
    public Owner getOwnerDni(@PathVariable("dni") String dni){
        return ownerService.getOwnerByDni(dni);
    }
    
    @PostMapping("/updateRegistrerOwner")
    public RegistrerOwner updateRegistrerOwner(@RequestBody RegistrerOwner registrerOwner){
        return registrerOwnerService.updateRegistrerOwner(registrerOwner);
    }
    
    @GetMapping("/allRegistrerUser")
    public List<RegistrerOwner> allRegistrerUser(){
        return registrerOwnerService.allRegistrerUser();
    }
    
    @GetMapping("/searchRegistrerOwner/{userName}/{password}")
    public RegistrerOwner searchRegistrerOwner(@PathVariable("userName")String userName, @PathVariable("password")String password){
        return registrerOwnerService.searchOwner(userName, password);
    }
    
    @GetMapping("/petByOwner/{owner_id}")
    public ArrayList<Pet> petByOwner(@PathVariable("owner_id") Integer ownerId){
        return petService.petByOwner(ownerId);
    }
    
    @GetMapping("/getAllUsers")
    public ArrayList<User> getAllUsers(){
        return userService.getAllUsers();
    }
    
    @GetMapping("/getVisits/{date}/{userId}")
    public List<Visit> getVisitByUserAndDate(@PathVariable("date") LocalDate date, @PathVariable("userId") int userId){
        return visitService.getBusyHours(date, userId);
    }
    
}
