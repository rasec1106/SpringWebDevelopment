/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiShoppingCart.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Cesar Herrera
 */
@Getter
@Setter
// in lombok we have a bug with @Data whenever we use transactions
// because of circular referency it bucles infinite times when saving transactions
@Entity(name="Orders") // this is a table on our design
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    @Embedded
    private Customer customer;
    private String trackingNumber;
    private Date orderDate;
    private BigDecimal amount;
    @OneToMany(mappedBy = "order" // name of the VARIABLE in the child class
            ,cascade = CascadeType.ALL) // to save also the into the child db
    private Set<OrderItem> orderItems;
    
    public void addOrderItem(OrderItem orderItem){
        if(orderItems == null){
            orderItems = new HashSet<>();
        }
        orderItems.add(orderItem);
        orderItem.setOrder(this);
    }
}
