/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.practica01.ApiPersona.dto;

import java.util.Set;
import lombok.Data;
import pe.cibertec.practica01.ApiPersona.entity.AddressByPerson;
import pe.cibertec.practica01.ApiPersona.entity.EmailByPerson;
import pe.cibertec.practica01.ApiPersona.entity.Person;

/**
 *
 * @author SUITE
 */
@Data
public class PersonRequest {
    public Person person;
    public Set<AddressByPerson> addresses;
    public Set<EmailByPerson> emails;
}
