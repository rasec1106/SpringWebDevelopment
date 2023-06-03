/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiAuth.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

/**
 *
 * @author Cesar.Herrera
 */
@Configuration
@EnableMethodSecurity // this is the latest annotation for security at 2023.05.21
public class SecurityConfig {
    // 1. Where is the UserDetails Service
    @Autowired
    // overrides the default behaviour of spring security
    private UserDetailsService userDetailsService; // By default uses my class UserDetailsServiceImpl because it implemented the interface
    // 2. Where is the PasswordEncoder
    @Bean
    // overrides behaviour (by default the password isn't encrypted)
    public static PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder(); // algorithm used to encript the password
    }
    // 3. Which is the Authentication Manager
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager(); // Spring security default authentication manager
    }
    // 4. Define which http methods we are going to use
     @Bean
     public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
         http.csrf().disable()
                 .authorizeHttpRequests((authorize) ->
                         authorize.requestMatchers("/api/auth/**").permitAll() //everything under this route is permited
                                 //.anyRequest().authenticated() // anything else needs to be authenticated
                                 .anyRequest().permitAll() // just to use the swagger
                 );
         return http.build();
     }
}
