/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCustomer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import lombok.Data;

/**
 *
 * @author Cesar Herrera
 */
@Entity
@Data // to create automatically getters and setters
public class Customer {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    /*
     * Validations are with annotations
     * Non nullable, nullable, unique, min, max, ranges, format - regex?
     * Empty, etc...
    
               // Add validator as a starter to the pom to use this!!!
     */
    // Annotations non nullable, unique
    private String name;
    private String email;
    private String phone;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
}
