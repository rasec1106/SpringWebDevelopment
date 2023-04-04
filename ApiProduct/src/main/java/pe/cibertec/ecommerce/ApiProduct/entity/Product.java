/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiProduct.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import lombok.Data;

/**
 *
 * @author Cesar Herrera
 */
@Entity
@Table(name="Product") // to explicity say which table to map
@Data
public class Product {
    @Id // to set the primary key
    @Column(name="idProduct") // to map the DB column with the attribute
    @GeneratedValue(strategy=GenerationType.IDENTITY) // to set an auto_increment value
    private Long id;
    @Column(name="nameProduct")
    private String name;
    @Column(name="descriptionProduct")
    private String description;
    @Column(name="unitPriceProduct")
    private BigDecimal unitPrice;
    @Column(name="imageUrlProduct")
    private String imageUrl;
}
/*
-- database Table script
create database apiProduct;
use apiProduct;
create table Product (
idProduct int primary key auto_increment,
nameProduct varchar(100),
descriptionProduct varchar(100),
unitPriceProduct decimal(10,2),
imageUrlProduct varchar(200)
);
*/