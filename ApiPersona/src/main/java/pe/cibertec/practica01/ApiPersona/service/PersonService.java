/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.practica01.ApiPersona.service;

import pe.cibertec.practica01.ApiPersona.dto.PersonRequest;
import pe.cibertec.practica01.ApiPersona.dto.PersonResponse;

/**
 *
 * @author SUITE
 */
public interface PersonService {
    public PersonResponse createPerson(PersonRequest personRequest);
}
