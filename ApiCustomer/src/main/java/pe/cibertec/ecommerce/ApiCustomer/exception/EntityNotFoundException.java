/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCustomer.exception;

/**
 *
 * @author Cesar Herrera
 */
public class EntityNotFoundException extends RuntimeException{
    
    public EntityNotFoundException(String message){
        super(message);
    }
}
