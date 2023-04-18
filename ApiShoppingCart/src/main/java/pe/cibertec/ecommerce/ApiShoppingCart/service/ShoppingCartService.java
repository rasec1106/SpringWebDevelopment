/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiShoppingCart.service;

import pe.cibertec.ecommerce.ApiShoppingCart.dto.PurchaseRequest;
import pe.cibertec.ecommerce.ApiShoppingCart.dto.PurchaseResponse;

/**
 *
 * @author Cesar Herrera
 */
public interface ShoppingCartService {
    public PurchaseResponse placeOrder(PurchaseRequest purchaseRequest);
}
