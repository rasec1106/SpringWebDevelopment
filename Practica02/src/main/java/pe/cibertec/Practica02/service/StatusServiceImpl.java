/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.Practica02.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import pe.cibertec.Practica02.dao.StatusRepository;
import pe.cibertec.Practica02.entity.DocumentStatus;

/**
 *
 * @author SUITE
 */
@Service
public class StatusServiceImpl implements StatusService {
    
    @Autowired
    private StatusRepository statusRepository;
    
    @Override
    public List<DocumentStatus> findAll() {
        return statusRepository.findAll();
    }

    @Override
    public DocumentStatus findById(Long id) {
        return statusRepository.findById(id).get();
    }

    @Override
    public DocumentStatus add(DocumentStatus status) {
        return statusRepository.save(status);
    }

    @Override
    public DocumentStatus update(Long id, DocumentStatus status) {
        DocumentStatus statusDB = statusRepository.findById(id).get();
        statusDB.setName(status.getName());
        return statusRepository.save(statusDB);                
    }

    @Override
    public void delete(Long id) {
        DocumentStatus statusDB = statusRepository.findById(id).get();
        statusRepository.delete(statusDB);  
    }

    @Override
    public Page<DocumentStatus> findAll(int page, int size) {
        return statusRepository.findAll(PageRequest.of(page, size));
    }
    
}
