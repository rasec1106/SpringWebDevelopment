/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.Practica02.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.Practica02.entity.DocumentStatus;
import pe.cibertec.Practica02.service.StatusService;

/**
 *
 * @author SUITE
 */
@RestController
@RequestMapping("/api/documentStatus")
public class StatusController {
    @Autowired
    private StatusService statusService;
    
    @GetMapping("/findAll")
    public ResponseEntity<List<DocumentStatus>> findAll(){
        return new ResponseEntity<>(statusService.findAll(),HttpStatus.OK);
    }
    
    @GetMapping("/findById/{id}")
    public ResponseEntity<DocumentStatus> findById(@PathVariable Long id){
        return new ResponseEntity<>(statusService.findById(id),HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<DocumentStatus> add(@RequestBody DocumentStatus status){
        return new ResponseEntity<>(statusService.add(status),HttpStatus.CREATED);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<DocumentStatus> update(@PathVariable Long id, @RequestBody DocumentStatus status){
        return new ResponseEntity<>(statusService.update(id, status),HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        statusService.delete(id);
    }
}
