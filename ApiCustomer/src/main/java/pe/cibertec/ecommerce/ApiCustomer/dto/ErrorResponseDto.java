/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCustomer.dto;

import java.util.Date;
import lombok.Data;
import org.springframework.http.HttpStatus;

/**
 *
 * @author Cesar Herrera
 */
@Data
public class ErrorResponseDto {
    private Date timestamp; // 2023.05.15 20:45:08
    private int code; // 404
    private String status; // Not found
    private Object message; // Customer with id=4 not found
    private String stackTrace; // Error detail
    
    public ErrorResponseDto(HttpStatus httpStatus, Object message, String stackTrace){
        this.timestamp = new Date();
        this.code = httpStatus.value();
        this.status = httpStatus.name();
        this.message = message;
        this.stackTrace = stackTrace;
    }
    
}
