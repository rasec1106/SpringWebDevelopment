/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCategory.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.ecommerce.ApiCategory.entity.Category;

/**
 *
 * @author Cesar Herrera
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {
    public Category findByIdCategory(String idCategory);
}
