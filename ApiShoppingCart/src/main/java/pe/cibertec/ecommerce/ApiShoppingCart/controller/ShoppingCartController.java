/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiShoppingCart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerce.ApiShoppingCart.dto.PurchaseRequest;
import pe.cibertec.ecommerce.ApiShoppingCart.dto.PurchaseResponse;
import pe.cibertec.ecommerce.ApiShoppingCart.service.ShoppingCartService;

/**
 *
 * @author Cesar Herrera
 */
@RestController
@RequestMapping("api/shoppingCart")
public class ShoppingCartController {
    
    @Autowired
    private ShoppingCartService shoppingCartService;
    
    @PostMapping("/placeOrder")
    public PurchaseResponse placeOrder(@RequestBody PurchaseRequest purchaseRequest){
        return shoppingCartService.placeOrder(purchaseRequest);
    }
}
