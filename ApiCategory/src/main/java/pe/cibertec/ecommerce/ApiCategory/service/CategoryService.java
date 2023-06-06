/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCategory.service;

import java.util.List;
import pe.cibertec.ecommerce.ApiCategory.entity.Category;

/**
 *
 * @author Cesar Herrera
 */
public interface CategoryService {
    public List<Category> findAll();
    public Category findByIdCategory(String idCategory);
    public Category add(Category category);
}
