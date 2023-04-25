/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.practica01.ApiPersona.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;
import lombok.Data;

/**
 *
 * @author SUITE
 */
@Entity
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personId;
    private String name;
    private String phone;
    @OneToMany(mappedBy = "person" // name of the VARIABLE in the child class
            ,cascade = CascadeType.ALL) // to save also the into the child db
    private Set<AddressByPerson> addresses;
    @OneToMany(mappedBy = "person" // name of the VARIABLE in the child class
            ,cascade = CascadeType.ALL) // to save also the into the child db
    private Set<EmailByPerson> emails;
    
    public void addAddress(AddressByPerson address){
        if(addresses == null){
            addresses = new HashSet<>();
        }
        addresses.add(address);
        address.setPerson(this);
    }
    
    public void addEmail(EmailByPerson email){
        if(emails == null){
            emails = new HashSet<>();
        }
        emails.add(email);
        email.setPerson(this);
    }
}
