/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiProductV2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerce.ApiProductV2.entity.Product;
import pe.cibertec.ecommerce.ApiProductV2.service.ProductService;

/**
 *
 * @author Cesar Herrera
 */
@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    
    @PostMapping("/add")
    public ResponseEntity<Product> add(@RequestBody Product product) {
        return new ResponseEntity<>(
                productService.add(product),
                HttpStatus.CREATED);
    }
}
