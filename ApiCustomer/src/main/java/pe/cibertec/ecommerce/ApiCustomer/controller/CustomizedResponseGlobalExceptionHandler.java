/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCustomer.controller;

import java.util.Date;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import pe.cibertec.ecommerce.ApiCustomer.dto.ErrorDetails;
import pe.cibertec.ecommerce.ApiCustomer.dto.ErrorResponseDto;
import pe.cibertec.ecommerce.ApiCustomer.exception.EntityNotFoundException;

/**
 *
 * @author Cesar.Herrera
 */
@ControllerAdvice
@RestController
public class CustomizedResponseGlobalExceptionHandler extends ResponseEntityExceptionHandler{
    
    public ResponseEntity<ErrorResponseDto> handleEntityNotFound(EntityNotFoundException ex){
        var status = HttpStatus.BAD_REQUEST;
        var errorResponse = new ErrorResponseDto(status, "Validation Failed", ex.getStackTrace().toString());
        return new ResponseEntity<>(errorResponse, status);
    } 
    
    @ExceptionHandler(EntityNotFoundException.class)
    public final ResponseEntity<ErrorDetails> handleEntityNotFoundException(EntityNotFoundException ex, WebRequest request) {
        ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(),
        request.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }
}
