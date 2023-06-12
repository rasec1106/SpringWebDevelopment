/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiProductV2.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.cibertec.ecommerce.ApiProductV2.entity.Category;

/**
 *
 * @author Cesar Herrera
 */
// value is a key:value needed by syntaxis
// url is where our server is located
@FeignClient(value = "feign-client", url = "http://localhost:8081")
public interface ApiRestClient {
    @GetMapping("/api/category/findByIdCategory/{idCategory}")
    public Category findByIdCategory(@PathVariable String idCategory);
}