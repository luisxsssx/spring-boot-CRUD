package com.example.springCRUD.Controller;

//import java.security.PublicKey;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatusCode;
//import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.springCRUD.Entity.Persona;
import com.example.springCRUD.Service.PersonaServiceIMP.PersonaServiceIMP;

@RestController
@RequestMapping("springCRUD")
public class Controlador {

    @Autowired
    private PersonaServiceIMP personaServiceimp;

    @GetMapping
    @RequestMapping(value = "ConsultarPersonas", method = RequestMethod.GET)
    public ResponseEntity <?> ConsultarPersonas(){
        List<Persona> listarPersona = this.personaServiceimp.ConsultarPersona();
        return ResponseEntity.ok(listarPersona);
    }

    @PostMapping
    @RequestMapping(value = "crearPersona", method = RequestMethod.POST)
    public ResponseEntity <?> crearPersona(@RequestBody Persona persona){
        Persona PersonaCreada = this.personaServiceimp.crearPersona(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(PersonaCreada);
    }

    @PutMapping
    @RequestMapping(value = "modificarPersona", method = RequestMethod.POST)
    public ResponseEntity <?> modificarPersona(@RequestBody Persona persona){
        Persona PersonaModificada = this.personaServiceimp.modificarPersona(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(PersonaModificada);
    }

    @GetMapping
    @RequestMapping(value = "BuscarPersona/{id}", method = RequestMethod.GET)
    public ResponseEntity <?> BuscarPersona(@PathVariable int id){
        Persona persona = this.personaServiceimp.BuscarPersona(id);
        return ResponseEntity.status(HttpStatus.CREATED).body(persona);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarPersona/{id}", method = RequestMethod.DELETE)
    public ResponseEntity <?> EliminarPersona(@PathVariable int id){
        this.personaServiceimp.EliminarPersona(id);
        return ResponseEntity.ok().build();
    }
}