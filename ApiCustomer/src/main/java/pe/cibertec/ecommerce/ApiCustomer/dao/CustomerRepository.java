/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCustomer.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.cibertec.ecommerce.ApiCustomer.entity.Customer;

/**
 *
 * @author Cesar Herrera
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    public Customer findByEmail(String email);
    public Customer findByPhone(String phone);
    @Query("SELECT c FROM Customer c WHERE c.phone like %?1%") //?1 means the first parameter
    public List<Customer> findByPhoneContaining(String phone);
}
