/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiAuth.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerce.ApiAuth.Dto.SignUpDto;
import pe.cibertec.ecommerce.ApiAuth.Entity.User;
import pe.cibertec.ecommerce.ApiAuth.Service.UserService;

/**
 *
 * @author Cesar.Herrera
 */
@RestController
@RequestMapping("/api/auth")
public class AuthController {
    
    @Autowired
    private UserService userService;
    
    // scans the code and will find the SecurityConfig file
    @Autowired
    private AuthenticationManager authManager;
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    @GetMapping("/hello")
    public ResponseEntity<String> Hello(){
        return new ResponseEntity<>("Hello world!",HttpStatus.OK);
    }
    
    @PostMapping("/signup")
    // ? is because I'll return a String or an Object
    public ResponseEntity<?> registerUser(@RequestBody SignUpDto signUpDto){
        // We can use a mapper library, but in this case we'll make it manually
        User user = new User();
        user.setName(signUpDto.getName());
        user.setUserName(signUpDto.getUserName());
        user.setEmail(signUpDto.getEmail());
        user.setPassword(passwordEncoder.encode(signUpDto.getPassword()));
        user.setRoles(signUpDto.getRoles());
        
        var result = userService.add(user);
        return new ResponseEntity<>(result,HttpStatus.CREATED);
    }
}
