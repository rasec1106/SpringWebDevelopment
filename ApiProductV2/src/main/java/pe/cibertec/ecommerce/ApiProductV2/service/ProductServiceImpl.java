/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiProductV2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiProductV2.dao.ProductRepository;
import pe.cibertec.ecommerce.ApiProductV2.dto.ProductDtoResponse;
import pe.cibertec.ecommerce.ApiProductV2.entity.Category;
import pe.cibertec.ecommerce.ApiProductV2.entity.Product;

/**
 *
 * @author Cesar Herrera
 */
@Service
@EnableFeignClients
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ApiRestClient apiRestClient;
    
    @Override
    public Product add(Product product) {
        return productRepository.save(product);
    }

    @Override
    public ProductDtoResponse findById(Long id) {
        // get the product from the database
        Product p = productRepository.findById(id).get();
        // get the category from another microservice
        Category category = apiRestClient.findByIdCategory(p.getIdCategory());
        
        // Format the response
        ProductDtoResponse productResponse = new ProductDtoResponse();
        productResponse.setId(p.getId());
        productResponse.setProductName(p.getProductName());
        productResponse.setUnitPrice(p.getUnitPrice());
        productResponse.setCategory(category);
        
        // return the response as we need
        return productResponse;
    }
    
}
