/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiShoppingCart.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author Cesar Herrera
 */
@Data
@AllArgsConstructor // the constructor needs all the attributes as parameters
public class PurchaseResponse {
    private String trackingNumber;    
}
