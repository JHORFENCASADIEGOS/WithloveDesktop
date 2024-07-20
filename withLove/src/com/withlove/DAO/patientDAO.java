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
    Patient ValidatePatient(int id, String pass) ;
    public int countPatient();
    
}
