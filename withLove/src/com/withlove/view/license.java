/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.withlove.view;

import com.withlove.DAO.PatientDAOImpl;
import com.withlove.DAO.ProfessionalDAOImpl;
import com.withlove.DAO.patientDAO;
import com.withlove.DAO.professionalDAO;
import com.withlove.model.Patient;
import com.withlove.model.Professional;
import java.awt.Color;
import static java.awt.Color.black;
import static java.awt.Color.white;
import java.awt.Cursor;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import javax.swing.JLabel;

/**
 *
 * @author USER
 */
public class license extends javax.swing.JFrame {

    /**
     * Creates new form license
     */
    professionalDAO daoPro = new ProfessionalDAOImpl();
    patientDAO daoPat = new PatientDAOImpl();
    int tabl;
    int idL;
    int licenseN = 1;

    public license() {
        initComponents();
        setImageLabel(background, "src/com/withlove/img/background.jpg");
        setResizable(false);
        login log = new login();
        String name = log.name;
        tabl = log.tabl;
        idL = log.id;

        check.setText("I " + name + " Accept");
        btnNext.setEnabled(false);
        tareaConditions.setCaretPosition(0);
    }

    private void setImageLabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tareaConditions = new javax.swing.JTextArea();
        check = new javax.swing.JCheckBox();
        btnBack = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 600));

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("and ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 120, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Conditions");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 250, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Terms");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 170, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 600));

        tareaConditions.setEditable(false);
        tareaConditions.setColumns(20);
        tareaConditions.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tareaConditions.setRows(5);
        tareaConditions.setText("Terms and Conditions of Use\n\nPlease read these Terms and Conditions of Use carefully before using our application for personal care, \ndeveloped for healthcare professionals. These terms govern your access and use of the application, \nas well as any information, content, functionality, and services available through it.\n\n1. Acceptance of Terms: By accessing or using our application, you agree to comply with and be\n legally bound by these terms and conditions of use. If you do not agree to any of these terms, please\n do not use our application.\n\n2. Authorized Use: Our application is intended for use exclusively by healthcare professionals for\n the purpose of providing personal care to their patients. It is strictly prohibited to use the application\n for any other purpose not related to its intended function.\n\n3. Privacy: We respect your privacy and are committed to protecting the personal information you\n may provide while using the application. Please refer to our privacy policy to understand how we collect, \nuse, and protect your data.\n\n4. User Responsibility: You are responsible for maintaining the confidentiality of your user account\n and any activity that occurs under your account. You must promptly notify us of any unauthorized use\n of your account or any other security breach.\n\n5. Content and Intellectual Property: All content, including text, graphics, logos, images, and \nsoftware, available through the application is protected by copyright and other intellectual property laws.\n You are not entitled to modify, copy, distribute, transmit, display, perform, reproduce, publish, license,\n create derivative works, transfer, or sell any content obtained through the application.\n\n6. Limitation of Liability: To the maximum extent permitted by applicable law, we shall not be liable\n for any direct, indirect, incidental, special, consequential, or punitive damages, including, among others,\n damages for loss of profits, data, use, or any other intangible loss, arising from the use or inability to\n use our application.\n\n7. Modifications: We reserve the right to modify, suspend, or discontinue, temporarily or permanently, \nthe application or any part thereof, with or without notice. Furthermore, we reserve the right to modify \nthese terms and conditions at any time. Your continued use of the application after such modifications\n shall constitute your acceptance of the modified terms and conditions.\n\n8. Applicable Law: These terms and conditions shall be governed and construed in accordance \nwith the laws of Cúcuta, without regard to its conflict of law provisions.\n\nBy using our application, you agree to these terms and conditions in their entirety. If you have any \nquestions or concerns about these terms and conditions, please contact us through the means \nprovided in the application. Thank you for your attention and for using our application for personal \ncare for healthcare professionals.");
        jScrollPane1.setViewportView(tareaConditions);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 590, 410));

        check.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                checkStateChanged(evt);
            }
        });
        jPanel1.add(check, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 180, -1));

        btnBack.setBackground(new java.awt.Color(255, 153, 153));
        btnBack.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 0, 0));
        btnBack.setText("BACK");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBackMouseExited(evt);
            }
        });
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, 120, 30));

        btnNext.setBackground(new java.awt.Color(255, 153, 153));
        btnNext.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        btnNext.setForeground(new java.awt.Color(0, 0, 0));
        btnNext.setText("CONTINUE");
        btnNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNextMouseExited(evt);
            }
        });
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel1.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 120, 30));
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 700, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered
        // TODO add your handling code here:
        btnBack.setCursor(new Cursor(Cursor.HAND_CURSOR));
        int rgb = Integer.parseInt("00CCFF", 16);
        Color color = new Color(rgb);
        btnBack.setBackground(color);
        btnBack.setForeground(white);
    }//GEN-LAST:event_btnBackMouseEntered

    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited
        // TODO add your handling code here:
        btnBack.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        int rgb = Integer.parseInt("FF9999", 16);
        Color color = new Color(rgb);
        btnBack.setBackground(color);
        btnBack.setForeground(black);
    }//GEN-LAST:event_btnBackMouseExited

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        // Btn back
        login log = new login();
        log.setVisible(true);
        log.setLocationRelativeTo(null);
        log.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnNextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseEntered
        // TODO add your handling code here:
        btnNext.setCursor(new Cursor(Cursor.HAND_CURSOR));
        int rgb = Integer.parseInt("00CCFF", 16);
        Color color = new Color(rgb);
        btnNext.setBackground(color);
        btnNext.setForeground(white);
    }//GEN-LAST:event_btnNextMouseEntered

    private void btnNextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseExited
        // TODO add your handling code here:
        btnNext.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        int rgb = Integer.parseInt("FF9999", 16);
        Color color = new Color(rgb);
        btnNext.setBackground(color);
        btnNext.setForeground(black);
    }//GEN-LAST:event_btnNextMouseExited

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        // Btn mainU

        if (tabl == 1) {
            daoPat.updateLicense(licenseN, idL);

            mainU mn = new mainU();
            mn.setVisible(true);
            mn.setResizable(false);
            mn.setLocationRelativeTo(null);
            this.dispose();
        }
        if (tabl == 2) {

            daoPro.updateLicense(licenseN, idL);
            mainP mnp;
            mnp = new mainP();
            mnp.setVisible(true);
            mnp.setResizable(false);
            mnp.setLocationRelativeTo(null);
            this.dispose();

        }


    }//GEN-LAST:event_btnNextActionPerformed

    private void checkStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_checkStateChanged
        // TODO add your handling code here:
        if (check.isSelected() == true) {
            btnNext.setEnabled(true);
            btnBack.setEnabled(false);
        } else {
            btnNext.setEnabled(false);
            btnBack.setEnabled(true);
        }
    }//GEN-LAST:event_checkStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNext;
    private javax.swing.JCheckBox check;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tareaConditions;
    // End of variables declaration//GEN-END:variables
}
