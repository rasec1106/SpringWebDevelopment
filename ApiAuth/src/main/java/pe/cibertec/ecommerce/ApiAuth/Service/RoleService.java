/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiAuth.Service;

import java.util.List;
import pe.cibertec.ecommerce.ApiAuth.Entity.Role;

/**
 *
 * @author Cesar.Herrera
 */
public interface RoleService {    
    public List<Role> findAll();
    public Role add(Role role);
    public Role findByName(String name);
}
