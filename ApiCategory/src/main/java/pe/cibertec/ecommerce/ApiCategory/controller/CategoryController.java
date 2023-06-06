/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCategory.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerce.ApiCategory.entity.Category;
import pe.cibertec.ecommerce.ApiCategory.service.CategoryService;

/**
 *
 * @author Cesar Herrera
 */
@RestController
@RequestMapping("/api/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    
    @GetMapping("/findAll")
    public ResponseEntity<List<Category>> findAll(){
        return new ResponseEntity<>(
                categoryService.findAll(),
                HttpStatus.OK);
    }
    
    @GetMapping("/findByIdCategory/{idCategory}")
    public ResponseEntity<Category> findByIdCategory(@PathVariable String idCategory) {
        return new ResponseEntity<>(
                categoryService.findByIdCategory(idCategory),
                HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Category> add(@RequestBody Category category) {
        return new ResponseEntity<>(
                categoryService.add(category),
                HttpStatus.CREATED);
    }
}
