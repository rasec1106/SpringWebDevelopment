/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCustomer.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    
    /*
     * There are 2 ways of working with parameters
     * 1. https:xxx/yy/findById?id=1 ... queryString or requestParams
     * 2. https:xxx/yy/findById/1    ... pathVariables
     */
    @GetMapping("/findById/{id}") // we'll work with path variables
    public Customer findById(@PathVariable Long id){
        return customerService.findById(id);    
    }
    
    @GetMapping("/findByEmail/{email}") 
    public Customer findByEmail(@PathVariable String email){
        return customerService.findByEmail(email);    
    }
    
    @GetMapping("/findByPhone") // the correct path is /findByPhone?phone=963xxx
    public Customer findByPhone(@RequestParam String phone){
        return customerService.findByPhone(phone);    
    }
    
    @GetMapping("/findByPhoneContaining/{phone}") 
    public List<Customer> findByPhoneContaining(@PathVariable String phone){
        return customerService.findByPhoneContaining(phone);    
    }
    
    @PostMapping("/add")
    public Customer add(@RequestBody Customer customer){
        return customerService.add(customer);
    }
    
    @PutMapping("/update/{id}")
    public Customer update(@PathVariable Long id, @RequestBody Customer customer){
        return customerService.update(id, customer);
    }
    
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        customerService.delete(id);
    }
}
