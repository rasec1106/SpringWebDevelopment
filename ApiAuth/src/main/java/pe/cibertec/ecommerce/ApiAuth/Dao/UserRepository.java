/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiAuth.Dao;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.cibertec.ecommerce.ApiAuth.Entity.User;

/**
 *
 * @author Cesar.Herrera
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{    
    // To avoid getting problems with NULLs we can use Optional<>
    public Optional<User> findByEmail(String email);    
    public Optional<User> findByUserName(String userName);
    public Optional<User> findByUserNameOrEmail(String userName, String email);
    public Optional<Boolean> existsByEmail(String email); // it makes a count internally
    public Optional<Boolean> existsByUserName(String userName);
}
