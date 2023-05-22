/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiAuth.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import java.util.Set;
import lombok.Data;

/**
 *
 * @author Cesar.Herrera
 */
@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String userName;
    private String email;
    private String password;
    
    @ManyToMany // to map the relationship
    @JoinTable( name="User_Roles", // to map the intermediate table
            joinColumns = @JoinColumn(name = "userid", // id for the intermediate table (for this class)
                    referencedColumnName = "id"), // id of the main table (User)
            inverseJoinColumns = @JoinColumn(name = "roleid", // id for the intermediate table (for the variable here below)
                    referencedColumnName = "id") // id of the variable referenced table (Role)
    ) 
    private Set<Role> roles;
}
