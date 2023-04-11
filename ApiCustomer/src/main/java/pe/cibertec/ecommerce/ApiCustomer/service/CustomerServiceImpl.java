/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCustomer.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiCustomer.dao.CustomerRepository;
import pe.cibertec.ecommerce.ApiCustomer.entity.Customer;

/**
 *
 * @author Cesar Herrera
 */
@Service
public class CustomerServiceImpl implements CustomerService{

    /**
     * This autowired annotation uses a framework to automatically create a new object when necessary
     */
    @Autowired // annotation for dependency injection
    private CustomerRepository customerRepository;
    
    @Override
    public List<Customer> findAll() {
        return (List<Customer>)customerRepository.findAll(); // this method is available because we are using CrudRepository
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Customer findByEmail(String email) {
        return customerRepository.findByEmail(email);
    }

    @Override
    public Customer findByPhone(String phone) {
        return customerRepository.findByPhone(phone);
    }

    @Override
    public List<Customer> findByPhoneContaining(String phone) {
        return customerRepository.findByPhoneContaining(phone);
    }
    
}
