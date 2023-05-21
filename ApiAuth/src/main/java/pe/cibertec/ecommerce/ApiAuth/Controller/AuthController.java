/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiAuth.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Cesar.Herrera
 */
@RestController
@RequestMapping("/api/Auth")
public class AuthController {
    
    @GetMapping("/hello")
    public ResponseEntity<String> Hello(){
        return new ResponseEntity<>("Hello world!",HttpStatus.OK);
    }
}
