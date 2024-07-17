/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.withlove.DAO;

import com.withlove.model.Patient;

/**
 *
 * @author USER
 */
public interface patientDAO extends CRUD<Patient> {
    
    public boolean validateEmail(String email);
    
    public String ecnode(String passEncrypt) ; 
    public String deecnode(String passDecrypt);
    Patient ValidatePatient(int id, String pass) ;
    public void updateLicense(int license,int id);
    
}
