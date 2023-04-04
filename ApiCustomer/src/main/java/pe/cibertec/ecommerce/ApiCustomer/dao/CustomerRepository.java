/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCustomer.dao;

import org.springframework.data.repository.CrudRepository;
import pe.cibertec.ecommerce.ApiCustomer.entity.Customer;

/**
 *
 * @author Cesar Herrera
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    
}
