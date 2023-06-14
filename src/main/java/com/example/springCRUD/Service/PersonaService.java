package com.example.springCRUD.Service;

import com.example.springCRUD.Entity.Persona;
import java.util.List;


public interface PersonaService {
    
    public List<Persona> ConsultarPersona();

    public Persona crearPersona(Persona persona);

    public Persona modificarPersona(Persona persona);

    public Persona BuscarPersona(int id);

    public void EliminarPersona(int id);
}