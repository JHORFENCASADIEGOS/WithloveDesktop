/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.withlove.view;

import com.withlove.DAO.CategoryDAOImpl;
import com.withlove.DAO.PatientDAOImpl;
import com.withlove.DAO.ProfessionalDAOImpl;
import com.withlove.model.Patient;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author SENA
 */
public class homeAdmin extends javax.swing.JPanel {
    
     PatientDAOImpl patientDAO = new PatientDAOImpl();
     ProfessionalDAOImpl professionalDAO = new ProfessionalDAOImpl();
     CategoryDAOImpl categoryDAO = new CategoryDAOImpl();
    
    public homeAdmin() {
        initComponents();       
        this.txtCountPatient.setText("Patient: "+patientDAO.countPatient());
        this.txtCountProfessional.setText("Professional: "+professionalDAO.countProfessional());
        this.txtCountCategory.setText("Category: "+categoryDAO.countCategory());
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCountPatient = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtCountProfessional = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtCountCategory = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(760, 540));
        setPreferredSize(new java.awt.Dimension(760, 540));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCountPatient.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtCountPatient.setText("No borrar esto");
        add(txtCountPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 120, 110));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 140, 130));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCountProfessional.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtCountProfessional.setText("No borrar esto");
        jPanel2.add(txtCountProfessional, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 100));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 160, 130));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCountCategory.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtCountCategory.setText("No borrar esto");
        jPanel3.add(txtCountCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 110));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 140, 130));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txtCountCategory;
    private javax.swing.JLabel txtCountPatient;
    private javax.swing.JLabel txtCountProfessional;
    // End of variables declaration//GEN-END:variables
}
