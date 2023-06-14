package com.example.springCRUD.Service.PersonaServiceIMP;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springCRUD.Entity.Persona;
import com.example.springCRUD.Repository.PersonaRepo;
import com.example.springCRUD.Service.PersonaService;

@Service
public class PersonaServiceIMP implements PersonaService{

    @Autowired
    private PersonaRepo repo;

    @Override
    public List<Persona> ConsultarPersona(){
        return (List<Persona>) this.repo.findAll();
    }

    @Override
    public Persona crearPersona(Persona persona) {
        persona.setEmail(persona.getEmail());
        return this.repo.save(persona);
    }

    @Override
    public Persona modificarPersona(Persona persona){
        return this.repo.save(persona);
    }

    @Override
    public Persona BuscarPersona(int id){
        return this.repo.findById(id).get();
    }

    @Override
    public void EliminarPersona(int id){
        this.repo.deleteById(id);
    }
}