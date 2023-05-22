/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiAuth.Dto;

import lombok.Data;

/**
 *
 * @author Cesar.Herrera
 */
@Data
public class LoginDto {
    private String userNameOrEmail;
    private String password;
}
