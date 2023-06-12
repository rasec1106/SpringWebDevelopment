/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiProduct.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.ecommerce.ApiProduct.entity.Product;

/**
 *
 * @author SUITE
 */
// extend from JPARepository<MyClass, PrimaryKeyDataType>
/*
We can use CRUDRepository but JPA has some tools to manage Pagination
*/
public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
