/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiShoppingCart.service;

import org.springframework.beans.factory.annotation.Autowired;
import pe.cibertec.ecommerce.ApiShoppingCart.dao.OrderRepository;
import pe.cibertec.ecommerce.ApiShoppingCart.dto.PurchaseRequest;
import pe.cibertec.ecommerce.ApiShoppingCart.dto.PurchaseResponse;

/**
 *
 * @author Cesar Herrera
 */
public class ShoppingCartServiceImpl implements ShoppingCartService{

    @Autowired
    private OrderRepository OrderRepository;
    
    @Override
    public PurchaseResponse placeOrder(PurchaseRequest purchaseRequest) {
        return null;
    }
    
}
