/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCustomer.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    
    /*
     * We need to improve the way we handle responses.
     * To do this we can use a Java class called ResponseEntity
     */
    
    @GetMapping("/findAll")
    public ResponseEntity<List<Customer>> findAll(){
        return new ResponseEntity<>(customerService.findAll(),
                HttpStatus.OK);   
    }
    
    @GetMapping("/findAll/page/{page}/size/{size}")
    public ResponseEntity<Page<Customer>> findAll(@PathVariable int page, @PathVariable int size){
        return new ResponseEntity<>(customerService.findAll(page, size),
                HttpStatus.OK);   
    }
    
    /*
     * There are 2 ways of working with parameters
     * 1. https:xxx/yy/findById?id=1 ... queryString or requestParams
     * 2. https:xxx/yy/findById/1    ... pathVariables
     */
    @GetMapping("/findById/{id}") // we'll work with path variables
    public ResponseEntity<Customer> findById(@PathVariable Long id){
        return new ResponseEntity<>(customerService.findById(id),
                HttpStatus.OK);   
    }
    
    @GetMapping("/findByEmail/{email}") 
    public ResponseEntity<Customer> findByEmail(@PathVariable String email){
        return new ResponseEntity<>(customerService.findByEmail(email),
                HttpStatus.OK); 
    }
    
    @GetMapping("/findByPhone") // the correct path is /findByPhone?phone=963xxx
    public ResponseEntity<Customer> findByPhone(@RequestParam String phone){
        return new ResponseEntity<>(customerService.findByPhone(phone),
                HttpStatus.OK);    
    }
    
    @GetMapping("/findByPhoneContaining/{phone}") 
    public ResponseEntity<List<Customer>> findByPhoneContaining(@PathVariable String phone){
        return new ResponseEntity<>(customerService.findByPhoneContaining(phone),
                HttpStatus.OK);    
    }
    
    @GetMapping("/findByNameContaining/{name}/page/{page}/size/{size}") 
    public ResponseEntity<Page<Customer>> findByNameContaining(
            @PathVariable String name, @PathVariable int page, @PathVariable int size){
        return new ResponseEntity<>(customerService.findByNameContaining(name,page,size),
                HttpStatus.OK);    
    }
    
    // To add the validator we need to use @Validate before the @RequestBody to tell the framework to validate
    @PostMapping("/add")
    public ResponseEntity<Customer> add(@RequestBody Customer customer){
        return new ResponseEntity<>(customerService.add(customer),
                HttpStatus.CREATED);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<Customer> update(@PathVariable Long id, @RequestBody Customer customer){
        return new ResponseEntity<>(customerService.update(id, customer),
                HttpStatus.OK); 
    }
    
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        customerService.delete(id);
    }
}
