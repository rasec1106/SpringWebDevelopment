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
import pe.cibertec.Practica02.dao.DocumentRepository;
import pe.cibertec.Practica02.entity.Document;

/**
 *
 * @author Cesar Herrera
 */
@Service
public class DocumentServiceImpl implements DocumentService{

    @Autowired
    private DocumentRepository documentRepository;
    
    @Override
    public List<Document> findAll() {
        return documentRepository.findAll();
    }

    @Override
    public Document findById(Long id) {
        return documentRepository.findById(id).get();
    }

    @Override
    public Document add(Document document) {
        return documentRepository.save(document);
    }

    @Override
    public Document update(Long id, Document document) {
        Document documentDB = documentRepository.findById(id).get();
        documentDB.setTitle(document.getTitle());
        documentDB.setDetail(document.getDetail());
        documentDB.setReceptionDate(document.getReceptionDate());
        documentDB.setStatus(document.getStatus());
        return documentRepository.save(documentDB);}

    @Override
    public void delete(Long id) {
        Document documentDB = documentRepository.findById(id).get();
        documentRepository.delete(documentDB);
    }

    @Override
    public Page<Document> findAll(int page, int size) {
        return documentRepository.findAll(PageRequest.of(page, size));
    }
    
}
