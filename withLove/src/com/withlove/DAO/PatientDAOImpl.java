/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.withlove.DAO;

import java.sql.PreparedStatement;
import com.withlove.db.connection;
import com.withlove.model.Patient;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import java.util.ArrayList;



/**
 *
 * @author USER
 */
public class PatientDAOImpl extends connection implements patientDAO {

    
   
    @Override
    public void create(Patient pat)  {
        try {
            this.establishConnection();
            
            PreparedStatement st = this.conect.prepareStatement("INSERT INTO patient (identification, namePatient, lastNamePa, email, phoneNumberPatient, birthdayDate, gender, passwordPatient, insurer)  VALUES(?,?,?,?,?,?,?,?,?);");
            st.setString(1, pat.getIdentification());
            st.setString(2, pat.getNamePatient());
            st.setString(3, pat.getLastNamePa());
            st.setString(4, pat.getEmail());
            st.setString(5, pat.getPhoneNumberPatient());
            java.sql.Date sqlDate = java.sql.Date.valueOf(pat.getBirthdayDate());
            st.setDate(6, sqlDate);
            st.setInt(7, pat.getGender());
            st.setString(8, pat.getPasswordPatient());
            st.setString(9, pat.getInsurer());
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
            JOptionPane.showConfirmDialog(null, "Error: "+e.toString());
        } finally {
            try {
                this.closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(PatientDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    

    @Override
    public Patient searchForId(String id) {
        Patient pat = null;
        
        try {
            this.establishConnection();
            PreparedStatement st = this.conect.prepareStatement("SELECT * FROM patient WHERE identification = ? LIMIT 1;");
            st.setString(1, id);
            
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                pat = new Patient();
                pat.setIdPatient(rs.getLong("idPatient"));
                pat.setIdentification(rs.getString("identification"));
                pat.setNamePatient(rs.getString("namePatient"));
                pat.setLastNamePa(rs.getString("lastNamePa"));
                pat.setEmail(rs.getString("email"));
                pat.setPhoneNumberPatient(rs.getString("phoneNumberPatient"));
                LocalDate birthdayDate = rs.getDate("birthdayDate").toLocalDate();
                pat.setBirthdayDate(birthdayDate);
                pat.setGender(rs.getInt("gender"));
                pat.setPasswordPatient(rs.getString("passwordPatient"));
                pat.setInsurer(rs.getString("insurer"));
                
            }
            rs.close();
            st.close();
        } catch(Exception e) {
            JOptionPane.showConfirmDialog(null, "Error: "+e.toString());
        } finally {
            try {
                this.closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(PatientDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return pat;
    }
    
    @Override
    public void update(Patient pat) {
         try {
            this.establishConnection();
            PreparedStatement st = this.conect.prepareStatement("UPDATE patient SET namePatient = ?, lastNamePa = ?, email = ?, phoneNumberPatient = ?, birthdayDate = ?,  gender = ?, passwordPatient = ?, insurer = ? WHERE identification = ?;");
            

            st.setString(1, pat.getNamePatient());
            st.setString(2, pat.getLastNamePa());
            st.setString(3, pat.getEmail());
            st.setString(4, pat.getPhoneNumberPatient());
            java.sql.Date sqlDate = java.sql.Date.valueOf(pat.getBirthdayDate());
            st.setDate(5, sqlDate);
            st.setInt(6, pat.getGender());
            st.setString(7, pat.getPasswordPatient());
            st.setString(8, pat.getInsurer());
            st.setString(9, pat.getIdentification());
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
            JOptionPane.showConfirmDialog(null, "Error: "+e.toString());
        } finally {
             try {
                 this.closeConnection();
             } catch (SQLException ex) {
                 Logger.getLogger(PatientDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
             }
        }    
    }

    @Override
    public void delete(Long id) {
        try {
            this.establishConnection();
            PreparedStatement st = this.conect.prepareStatement("DELETE FROM patient WHERE idPatient = ?;");
            st.setLong(1, id);
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
            JOptionPane.showConfirmDialog(null, "Error: "+e.toString());
        } finally {
            try {
                this.closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(PatientDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(email);
        return mather.find();
    }

   
    @Override
    public Patient ValidatePatient(int id, String pass)  {
         Patient pat = null;
        
        try {
            this.establishConnection();
            PreparedStatement st = this.conect.prepareStatement("SELECT * FROM patient WHERE identification = ? AND passwordPatient = ? LIMIT 1;");
            st.setInt(1, id);
            st.setString(2, pass);
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                pat = new Patient();               
               pat.setIdPatient(rs.getLong("idPatient"));
                pat.setIdentification(rs.getString("identification"));
                pat.setNamePatient(rs.getString("namePatient"));
                pat.setLastNamePa(rs.getString("lastNamePa"));
                pat.setEmail(rs.getString("email"));
                pat.setPhoneNumberPatient(rs.getString("phoneNumberPatient"));
                LocalDate birthdayDate = rs.getDate("birthdayDate").toLocalDate();
                pat.setBirthdayDate(birthdayDate);
                pat.setGender(rs.getInt("gender"));
                pat.setPasswordPatient(rs.getString("passwordPatient"));
                pat.setInsurer(rs.getString("insurer"));
               // JOptionPane.showConfirmDialog(null, "Welcome");
            }
            rs.close();
            st.close();
        } catch(Exception e) {
            
            JOptionPane.showConfirmDialog(null, "Error: "+e.toString());
        } finally {
             try {
                 this.closeConnection();
             } catch (SQLException ex) {
                 Logger.getLogger(PatientDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        return pat;
    }   

     @Override
    public List<Patient> getAll() {
        List<Patient> patientList = new ArrayList<Patient>();
        
        try {
            this.establishConnection();
            PreparedStatement st = this.conect.prepareStatement("SELECT * FROM patient;");
            
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Patient pat = new Patient();
                pat.setIdPatient(rs.getLong("idPatient"));
                pat.setIdentification(rs.getString("identification"));
                pat.setNamePatient(rs.getString("namePatient"));
                pat.setLastNamePa(rs.getString("lastNamePa"));
                pat.setEmail(rs.getString("email"));
                pat.setPhoneNumberPatient(rs.getString("phoneNumberPatient"));
                LocalDate birthdayDate = rs.getDate("birthdayDate").toLocalDate();
                pat.setBirthdayDate(birthdayDate);
                pat.setGender(rs.getInt("gender"));
                pat.setPasswordPatient(rs.getString("passwordPatient"));
                pat.setInsurer(rs.getString("insurer"));
                patientList.add(pat);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error: " + e.toString());
        } finally {
            try {
                this.closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(PatientDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return patientList;
    }

    @Override
    public int countPatient() {
        int count=0;
        try {
            this.establishConnection();
             PreparedStatement st = this.conect.prepareStatement("SELECT COUNT(*) FROM patient");
            
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                 count = rs.getInt(1); // Obtener el primer valor de la primera fila
               // System.out.println("Total de pacientes: " + count);
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error: " + e.toString());
        } finally {
            try {
                this.closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(PatientDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        return count;
    }
}  