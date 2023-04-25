/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.practica01.ApiPersona.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.practica01.ApiPersona.dao.PersonRepository;
import pe.cibertec.practica01.ApiPersona.dto.PersonRequest;
import pe.cibertec.practica01.ApiPersona.dto.PersonResponse;
import pe.cibertec.practica01.ApiPersona.entity.Person;

/**
 *
 * @author SUITE
 */
@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonRepository personRepository;
    
    @Override
    @Transactional
    public PersonResponse createPerson(PersonRequest personRequest) {
        Person person = personRequest.getPerson(); // get the person from the request
        
        // Add the list of addresses and emails to the person
        personRequest.getAddresses().forEach(address -> person.addAddress(address));        
        personRequest.getEmails().forEach(email -> person.addEmail(email));

        // Save person and orderItems - for the cascade annotation
        personRepository.save(person);
        
        // Creating the response
        PersonResponse response = new PersonResponse();
        response.setPersonId(person.getPersonId());
        response.setName(person.getName());
        response.setNumberOfAddresses(person.getAddresses().size());
        response.setNumberOfEmails(person.getEmails().size());
        
        return response;
    }
    
}
