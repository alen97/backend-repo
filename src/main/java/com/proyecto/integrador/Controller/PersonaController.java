package com.proyecto.integrador.Controller;

import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/persona")
@CrossOrigin(origins = "http://localhost:4200") //sirve para que acepte las peticiones desde esa página
public class PersonaController {
    // @Autowired
    // ImpPersonaService ipersonaService; 
    
    @GetMapping("/lista")
    public ResponseEntity<List<String>> list(){
        // List<Persona> list= ipersonaService.list();
        return new ResponseEntity("ok", HttpStatus.OK);
    }
    
}