/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCustomer.service;

import java.util.List;
import org.springframework.data.domain.Page;
import pe.cibertec.ecommerce.ApiCustomer.entity.Customer;

/**
 *
 * @author Cesar Herrera
 */
public interface CustomerService {
    public List<Customer> findAll();
    // Page is a Collection, like a List. But we cand o pagination with it
    public Page<Customer> findAll(int page, int size);
    public Customer findById(Long id);
    public Customer findByEmail(String email);
    public Customer findByPhone(String phone);
    public List<Customer> findByPhoneContaining(String phone);
    public Customer add(Customer customer);
    public Customer update(Long id, Customer customer);
    public void delete(Long id);
}
