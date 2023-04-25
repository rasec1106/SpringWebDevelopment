/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.practica01.ApiPersona.dto;

import lombok.Data;

/**
 *
 * @author SUITE
 */
@Data
public class PersonResponse {
    private Long personId;
    private String name;
    private int numberOfAddresses;
    private int numberOfEmails;
}
