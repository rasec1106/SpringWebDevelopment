/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiAuth.Dto;

import java.util.Set;
import lombok.Data;
import pe.cibertec.ecommerce.ApiAuth.Entity.Role;

/**
 *
 * @author Cesar.Herrera
 */
@Data
public class SignUpDto {
    private String name;
    private String userName;
    private String email;
    private String password;
    private Set<Role> roles;
}
