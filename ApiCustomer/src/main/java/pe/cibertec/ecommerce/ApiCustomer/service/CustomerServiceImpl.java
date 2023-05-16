/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCustomer.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiCustomer.dao.CustomerRepository;
import pe.cibertec.ecommerce.ApiCustomer.entity.Customer;
import pe.cibertec.ecommerce.ApiCustomer.exception.EntityNotFoundException;

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
    public Page<Customer> findAll(int page, int size) {
        return customerRepository.findAll(PageRequest.of(page, size));
    }

    @Override
    public Customer findById(Long id) {
        // this throws an exception if not found
        return customerRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Customer with id "+id+" not found")
        );
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

    @Override
    public Customer add(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer update(Long id, Customer customer) {
        Customer customerDB = customerRepository.findById(id).get();
        customerDB.setName(customer.getName());
        customerDB.setEmail(customer.getEmail());        
        customerDB.setPhone(customer.getPhone());
        
        return customerRepository.save(customerDB);
    }

    @Override
    public void delete(Long id) {
        Customer customerDB = customerRepository.findById(id).get();
        customerRepository.delete(customerDB);    
    }
    
}
