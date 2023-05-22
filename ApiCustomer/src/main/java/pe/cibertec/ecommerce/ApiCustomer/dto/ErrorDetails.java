/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCustomer.dto;

import java.util.Date;

/**
 *
 * @author Cesar.Herrera
 */
public class ErrorDetails {
    private Date timestamp;
    private String message;
    private String details;

    public ErrorDetails(Date timestamp, String message, String details) {
      super();
      this.timestamp = timestamp;
      this.message = message;
      this.details = details;
    }
}
