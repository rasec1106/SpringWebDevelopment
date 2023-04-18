/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiShoppingCart.entity;

import jakarta.persistence.Embeddable;
import java.math.BigDecimal;
import lombok.Data;

/**
 *
 * @author Cesar Herrera
 */
@Data
@Embeddable // this is embedded in OrderItem
public class Item {
    private Long itemId;
    private String productName;
    private BigDecimal unitPrice;
}
