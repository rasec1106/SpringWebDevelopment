/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiShoppingCart.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

/**
 *
 * @author Cesar Herrera
 */
//@Entity 
// we dont use the entity annotation because it's not a table, but part of a bigger table
@Data
@Embeddable
public class Customer {
    private Long customerId;
    private String name;
    private String email;
    private String phone;
}
