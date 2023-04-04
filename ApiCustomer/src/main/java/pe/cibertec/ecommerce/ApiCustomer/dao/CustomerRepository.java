/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCustomer.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.cibertec.ecommerce.ApiCustomer.entity.Customer;

/**
 *
 * @author Cesar Herrera
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    public List<Customer> findByEmail(String email);
}
