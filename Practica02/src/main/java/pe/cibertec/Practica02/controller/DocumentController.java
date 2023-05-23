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
import pe.cibertec.Practica02.entity.Document;
import pe.cibertec.Practica02.service.DocumentService;

/**
 *
 * @author SUITE
 */
@RestController
@RequestMapping("/api/document")
public class DocumentController {
    @Autowired
    private DocumentService documentService;
    
    @GetMapping("/findAll")
    public ResponseEntity<List<Document>> findAll(){
        return new ResponseEntity<>(documentService.findAll(),HttpStatus.OK);
    }
    
    @GetMapping("/findById/{id}")
    public ResponseEntity<Document> findById(@PathVariable Long id){
        return new ResponseEntity<>(documentService.findById(id),HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Document> add(@RequestBody Document document){
        return new ResponseEntity<>(documentService.add(document),HttpStatus.CREATED);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<Document> update(@PathVariable Long id, @RequestBody Document document){
        return new ResponseEntity<>(documentService.update(id, document),HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        documentService.delete(id);
    }
}
