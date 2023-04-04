/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCustomer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;

/**
 *
 * @author Cesar Herrera
 */
@Entity
public class Customer {
    private Long id;
    private String name;
    private String email;
    private String phone;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
}
