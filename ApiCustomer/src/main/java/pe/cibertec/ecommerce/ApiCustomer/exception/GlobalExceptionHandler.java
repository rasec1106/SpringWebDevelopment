/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCustomer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import pe.cibertec.ecommerce.ApiCustomer.dto.ErrorResponseDto;

/**
 *
 * @author Cesar Herrera
 */
/*
 * This anottation overrides and acts like the Default Error Handler of Spring Framework 
 * So this class will handle all my exceptions
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ErrorResponseDto> handleEntityNotFound(EntityNotFoundException ex){
        var status = HttpStatus.NOT_FOUND;
        var errorResponse = new ErrorResponseDto(status, ex.getMessage(), ex.getStackTrace().toString());
        return new ResponseEntity<>(errorResponse, status);
    }
    
    // When we validate we can have multiple errors, so in this case the error response is getting a "message" as an array
    // so we can pass multiple errors
}
