/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCategory.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
// import jakarta.persistence.Table;

/**
 *
 * @author Cesar Herrera
 */
@Entity
@Data
// @Table(name = "Category") // by default it has the name of the class
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String idCategory; // this will help us to communicate with another microservice
    // immagine i need to restory my db, ids will not necessary be the same
    private String name;
}
