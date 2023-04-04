/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCustomer.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerce.ApiCustomer.entity.Customer;
import pe.cibertec.ecommerce.ApiCustomer.service.CustomerService;

/**
 *
 * @author Cesar Herrera
 */
@RestController
@RequestMapping("/api/customer") // base path
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    
    @GetMapping("/findAll")
    public List<Customer> findAll(){
        return customerService.findAll();    
    }
    
    @GetMapping("/findById")
    public Customer findById(Long id){
        return customerService.findById(id);    
    }
}
