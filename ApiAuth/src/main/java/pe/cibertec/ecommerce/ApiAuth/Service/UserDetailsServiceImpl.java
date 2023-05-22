/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiAuth.Service;

import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiAuth.Dao.UserRepository;
import pe.cibertec.ecommerce.ApiAuth.Entity.User;

/**
 *
 * @author Cesar.Herrera
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService{

    @Autowired
    private UserRepository userRepository;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        // First find the user in our database
        User user = userRepository.findByUserNameOrEmail(username, username)
                .orElseThrow(()->new UsernameNotFoundException("User not found"));
        
        // Then we get the roles and convert them into authorities
        Set<GrantedAuthority> authorities = user.getRoles()
                .stream() // converts it into a stream for the framework
                .map(role->new SimpleGrantedAuthority(role.getName())) // passing all the roles
                .collect(Collectors.toSet()); // reconverts it into a collector
        
        // Return the object UserDetails from Spring Security
        return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(), authorities);
    }
    
}
