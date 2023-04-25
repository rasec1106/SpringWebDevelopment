/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.practica01.ApiPersona.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.practica01.ApiPersona.dto.PersonRequest;
import pe.cibertec.practica01.ApiPersona.dto.PersonResponse;
import pe.cibertec.practica01.ApiPersona.service.PersonService;

/**
 *
 * @author SUITE
 */
@RestController
@RequestMapping("api/person")
public class PersonController {
    @Autowired
    private PersonService personService;
    
    @PostMapping("/createPerson")
    public PersonResponse createPerson(@RequestBody PersonRequest personRequest){
        return personService.createPerson(personRequest);
    }
}
