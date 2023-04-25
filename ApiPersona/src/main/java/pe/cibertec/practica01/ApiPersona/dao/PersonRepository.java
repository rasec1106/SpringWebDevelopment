/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.practica01.ApiPersona.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.practica01.ApiPersona.entity.Person;

/**
 *
 * @author SUITE
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
}
