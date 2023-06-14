package com.example.springCRUD.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springCRUD.Entity.Persona;

public interface PersonaRepo extends CrudRepository<Persona,Integer>{
    
}