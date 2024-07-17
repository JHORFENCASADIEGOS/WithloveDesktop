/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.withlove.view;


import com.withlove.DAO.PatientDAOImpl;
import com.withlove.DAO.professionalDAO;
import com.withlove.DAO.ProfessionalDAOImpl;
import com.withlove.DAO.patientDAO;
import com.withlove.model.Patient;
import com.withlove.model.Professional;
import java.awt.Color;
import static java.awt.Color.*;
import java.awt.Cursor;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public static int id;
    public static String name;
    public static int licen;
    public static int tabl;
    
    patientDAO daoPat = new PatientDAOImpl();
    Patient pat = new Patient();
    professionalDAO daoPro = new ProfessionalDAOImpl();
    Professional pro= new Professional();
    
    
    public login() {
        initComponents();
        setImageLabel(background, "src/com/withlove/img/background.jpg");
        setLocationRelativeTo(null);
        setResizable(false);
       
    }
    
    private void setImageLabel(JLabel labelName, String root){
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdentification = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JLabel();
        RbtnPatient = new javax.swing.JRadioButton();
        RbtnProfessional = new javax.swing.JRadioButton();
        cbShowP = new javax.swing.JCheckBox();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TO");

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("WELCOME");

        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("WITH");

        jLabel7.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("LOVE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addContainerGap(215, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 600));

        container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabel3.setText("LOG IN");
        container.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        jLabel2.setText("Identification:");
        container.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 90, 20));

        jLabel4.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        jLabel4.setText("Password:");
        container.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 90, 20));

        txtIdentification.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        txtIdentification.setForeground(new java.awt.Color(204, 204, 204));
        txtIdentification.setText("Enter your identification");
        txtIdentification.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtIdentificationMousePressed(evt);
            }
        });
        container.add(txtIdentification, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 290, -1));

        btnLogin.setBackground(new java.awt.Color(255, 153, 153));
        btnLogin.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 0, 0));
        btnLogin.setText("LOG IN");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        container.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 120, 30));

        txtPassword.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 0, 0));
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPasswordMousePressed(evt);
            }
        });
        container.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 290, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 3, 14)); // NOI18N
        jLabel8.setText("You do not have an account?");
        container.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, -1, -1));

        btnSignUp.setFont(new java.awt.Font("Roboto Black", 3, 14)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(204, 0, 0));
        btnSignUp.setText("SIGN UP");
        btnSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignUpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSignUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSignUpMouseExited(evt);
            }
        });
        container.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, -1, -1));

        buttonGroup1.add(RbtnPatient);
        RbtnPatient.setSelected(true);
        RbtnPatient.setText("Patient");
        container.add(RbtnPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        buttonGroup1.add(RbtnProfessional);
        RbtnProfessional.setText("Professional");
        container.add(RbtnProfessional, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));

        cbShowP.setBackground(new java.awt.Color(255, 204, 204));
        cbShowP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbShowPActionPerformed(evt);
            }
        });
        container.add(cbShowP, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, -1, -1));

        background.setFont(new java.awt.Font("Roboto Medium", 3, 14)); // NOI18N
        container.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 600));

        jPanel1.add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 650, 600));

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

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        // Btn login
        
        if(!txtIdentification.getText().trim().equals("") && !(new String(txtPassword.getPassword())).trim().equals("")){
            if(RbtnPatient.isSelected()){
                try {
                    String passwordE = daoPat.ecnode(new String(txtPassword.getPassword()));
                    pat=daoPat.ValidatePatient((Integer.parseInt(txtIdentification.getText())), passwordE);
                    if(pat!=null){
                       name = pat.getFirstNames();
                       licen = pat.getLicense();
                       id = (Integer.parseInt(txtIdentification.getText()));   
                       tabl= 1;
                       if(licen==1){
                           mainU app1 = new mainU();
                           app1.setVisible(true);
                           app1.setResizable(false);
                           app1.setLocationRelativeTo(null);
                           this.dispose();
                       } else{
                           license lic = new license();
                           lic.setVisible(true);
                           lic.setResizable(false);
                           lic.setLocationRelativeTo(null);
                           this.dispose();
                       }
                    } else{
                        JOptionPane.showConfirmDialog(null, "Patient not found");
                    }
                    
                    
                } catch (Exception ex) {
                    JOptionPane.showConfirmDialog(null, "You misspelled in the ID field");
                }
            } if(RbtnProfessional.isSelected()){
                try {
                    String passwordE = daoPro.ecnode( new String(txtPassword.getPassword()));
                    pro=daoPro.ValidateProfessional((Integer.parseInt(txtIdentification.getText())), passwordE);
                    if(pro!=null){
                       name = pro.getFirstNames();
                       licen = pro.getLicense();
                       id = (Integer.parseInt(txtIdentification.getText())); 
                       tabl = 2;
                       if(licen==1){
                           mainP app2 = new mainP();
                           app2.setVisible(true);
                           app2.setResizable(false);
                           app2.setLocationRelativeTo(null);
                           this.dispose();
                       } else{
                           license lic = new license();
                           lic.setVisible(true);
                           lic.setResizable(false);
                           lic.setLocationRelativeTo(null);
                           this.dispose();
                       }
                    }else{
                        JOptionPane.showConfirmDialog(null, "Professional not found");
                    }
                } catch (Exception ex) {
                    JOptionPane.showConfirmDialog(null, "You misspelled in the ID field");
                }
            }
            
        } else{
             JOptionPane.showMessageDialog(null, "Please fill in all fields. Some fields are still empty.");
           
             

            // codigo de la siguiente interfaz
            
        }
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtIdentificationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdentificationMousePressed
        // TODO add your handling code here:
        if(txtIdentification.getText().equals("Enter your identification")){
        txtIdentification.setText("");
        txtIdentification.setForeground(black);
        }
       /* if(String.valueOf(txtPassword.getPassword()).isEmpty()){
        txtPassword.setText("******");
        txtPassword.setForeground(gray);
        }*/
    }//GEN-LAST:event_txtIdentificationMousePressed

    private void txtPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMousePressed
        // TODO add your handling code here:
       /* if(String.valueOf(txtPassword.getPassword()).equals("******")){
        txtPassword.setText("");
        txtPassword.setForeground(black);
        } */
       /* if(txtIdentification.getText().isEmpty()){
        txtIdentification.setText("Enter your identification");
        txtIdentification.setForeground(gray);
        } */
    }//GEN-LAST:event_txtPasswordMousePressed

    private void btnSignUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpMouseEntered
        // TODO add your handling code here:
        // cursor encima del SIGN UP
        btnSignUp.setCursor(new Cursor(Cursor.HAND_CURSOR));
        int rgb = Integer.parseInt("00CCFF", 16);
        Color color = new Color(rgb);
        btnSignUp.setForeground(color);
    }//GEN-LAST:event_btnSignUpMouseEntered

    private void btnSignUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpMouseExited
        // TODO add your handling code here:
        // Cursor cuando se va del SIGN UP
        btnSignUp.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        btnSignUp.setForeground(black);
    }//GEN-LAST:event_btnSignUpMouseExited

    private void btnSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpMouseClicked
        // TODO add your handling code here:
        // click sobre el Jlabel
        signUp signup = new signUp();
        signup.setVisible(true);
        signup.setLocationRelativeTo(null);
        signup.setResizable(false);
        this.dispose();
        
    }//GEN-LAST:event_btnSignUpMouseClicked
        
    // LOG IN
    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        // TODO add your handling code here:
        btnLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        int rgb = Integer.parseInt("00CCFF", 16);
        Color color = new Color(rgb);
        btnLogin.setBackground(color);
        btnLogin.setForeground(white);
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        // TODO add your handling code here:
        btnLogin.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        int rgb = Integer.parseInt("FF9999", 16);
        Color color = new Color(rgb);
        btnLogin.setBackground(color);
        btnLogin.setForeground(black);
    }//GEN-LAST:event_btnLoginMouseExited

    private void cbShowPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbShowPActionPerformed
        // TODO add your handling code here:
        if (cbShowP.isSelected()) {
            txtPassword.setEchoChar((char) 0); //password = JPasswordField
            
        } else {
            txtPassword.setEchoChar('*');
            
        }
    }//GEN-LAST:event_cbShowPActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RbtnPatient;
    private javax.swing.JRadioButton RbtnProfessional;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel btnSignUp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbShowP;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtIdentification;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
