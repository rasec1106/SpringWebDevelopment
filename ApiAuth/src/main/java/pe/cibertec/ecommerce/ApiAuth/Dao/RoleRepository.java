/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiAuth.Dao;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.cibertec.ecommerce.ApiAuth.Entity.Role;

/**
 *
 * @author Cesar.Herrera
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
    public Optional<Role> findByName(String name);
}
