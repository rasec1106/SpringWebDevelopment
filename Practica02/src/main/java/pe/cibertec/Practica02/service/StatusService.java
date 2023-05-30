/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.Practica02.service;

import java.util.List;
import org.springframework.data.domain.Page;
import pe.cibertec.Practica02.entity.DocumentStatus;

/**
 *
 * @author SUITE
 */
public interface StatusService {
    public List<DocumentStatus> findAll();
    public Page<DocumentStatus> findAll(int page, int size);
    public DocumentStatus findById(Long id);
    public DocumentStatus add(DocumentStatus status);
    public DocumentStatus update(Long id, DocumentStatus status);
    public void delete(Long id);
}
