/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiShoppingCart.dto;

import java.util.Set;
import lombok.Data;
import pe.cibertec.ecommerce.ApiShoppingCart.entity.Order;
import pe.cibertec.ecommerce.ApiShoppingCart.entity.OrderItem;

/**
 *
 * @author Cesar Herrera
 */
@Data
public class PurchaseRequest {
    public Order order;
    public Set<OrderItem> orderItems;
}
