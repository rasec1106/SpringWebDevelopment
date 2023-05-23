/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.Practica02.service;

import java.util.List;
import pe.cibertec.Practica02.entity.Document;

/**
 *
 * @author SUITE
 */
public interface DocumentService {
    public List<Document> findAll();
    public Document findById(Long id);
    public Document add(Document document);
    public Document update(Long id, Document document);
    public void delete(Long id);
}
