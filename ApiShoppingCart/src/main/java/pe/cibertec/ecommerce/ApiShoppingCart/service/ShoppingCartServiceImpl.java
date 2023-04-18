/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiShoppingCart.service;

import jakarta.transaction.Transactional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiShoppingCart.dao.OrderRepository;
import pe.cibertec.ecommerce.ApiShoppingCart.dto.PurchaseRequest;
import pe.cibertec.ecommerce.ApiShoppingCart.dto.PurchaseResponse;
import pe.cibertec.ecommerce.ApiShoppingCart.entity.Order;

/**
 *
 * @author Cesar Herrera
 */
@Service
public class ShoppingCartServiceImpl implements ShoppingCartService{

    @Autowired
    private OrderRepository orderRepository;
    
    @Override
    @Transactional // this assures commit or rollback
    public PurchaseResponse placeOrder(PurchaseRequest purchaseRequest) {
        Order order = purchaseRequest.getOrder(); // get the order from the request
        order.setTrackingNumber(getTrackingNumber()); // random UID from method
        // Add the list of items to the order
        purchaseRequest.getOrderItems().forEach(orderItem -> order.addOrderItem(orderItem));
        // Save order and orderItems - for the cascade annotation
        orderRepository.save(order);
        return new PurchaseResponse(order.getTrackingNumber());
    }
    
    private String getTrackingNumber(){
        return UUID.randomUUID().toString();
    }
    
}
