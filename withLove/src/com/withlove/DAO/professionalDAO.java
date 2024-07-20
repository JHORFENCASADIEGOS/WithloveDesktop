/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.withlove.DAO;

import com.withlove.model.Professional;

/**
 *
 * @author USER
 */
public interface professionalDAO extends CRUD<Professional> {
    
       public boolean validateEmail(String email);
    Professional ValidateProfessional(int id, String pass) ;
    public int countProfessional();
}
