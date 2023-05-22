/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiAuth.Service;

import pe.cibertec.ecommerce.ApiAuth.Entity.User;

/**
 *
 * @author Cesar.Herrera
 */
public interface UserService {
    public User findByEmail(String email);    
    public User findByUserName(String userName);
    public User findByUserNameOrEmail(String userName, String email);
    public Boolean existsByEmail(String email); 
    public Boolean existsByUserName(String userName);
    public User add(User user);
}
