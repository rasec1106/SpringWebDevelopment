/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiProductV2.dto;

import lombok.Data;
import pe.cibertec.ecommerce.ApiProductV2.entity.Category;

/**
 *
 * @author Cesar Herrera
 */
@Data
public class ProductDtoResponse {
    private Long id;
    private String productName;
    private Double unitPrice;
    private Category category;
}
