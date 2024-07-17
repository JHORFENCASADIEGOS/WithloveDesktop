/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.withlove.DAO;

import java.sql.PreparedStatement;
import com.withlove.db.connection;
import com.withlove.model.Patient;
import java.security.MessageDigest;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import org.apache.commons.codec.binary.Base64;



/**
 *
 * @author USER
 */
public class PatientDAOImpl extends connection implements patientDAO {

   
    @Override
    public void create(Patient pat)  {
        try {
            this.establishConnection();
            PreparedStatement st = this.conect.prepareStatement("INSERT INTO patient (identification, firstNames, surNames, neighborhood, address, city, email, phoneNumber, password)  VALUES(?,?,?,?,?,?,?,?,?);");
            st.setInt(1, pat.getIdentification());
            st.setString(2, pat.getFirstNames());
            st.setString(3, pat.getSurNames());
            st.setString(4, pat.getNeighborhood());
            st.setString(5, pat.getAddress());
            st.setString(6, pat.getCity());
            st.setString(7, pat.getEmail());
            st.setString(8, pat.getPhoneNumber());
            st.setString(9, pat.getPassword());
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
    public Patient searchForId(int id) {
        Patient pat = null;
        
        try {
            this.establishConnection();
            PreparedStatement st = this.conect.prepareStatement("SELECT * FROM patient WHERE identification = ? LIMIT 1;");
            st.setInt(1, id);
            
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                pat = new Patient();
                pat.setIdentification(rs.getInt("identification"));
                pat.setIdPatient(rs.getInt("idPatient"));
                pat.setFirstNames(rs.getString("firstNames"));
                pat.setSurNames(rs.getString("surNames"));
                pat.setNeighborhood(rs.getString("neighborhood"));
                pat.setAddress(rs.getString("address"));
                pat.setCity(rs.getString("city"));
                pat.setEmail(rs.getString("email"));
                pat.setPhoneNumber(rs.getString("phoneNumber"));
                pat.setPassword(rs.getString("password"));
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
            PreparedStatement st = this.conect.prepareStatement("UPDATE patient SET firstNames = ?, surNames = ?, neighborhood = ?, address = ?, city = ?, email = ?, phoneNumber = ?, password = ? WHERE identification = ?;");
            

            st.setString(1, pat.getFirstNames());
            st.setString(2, pat.getSurNames());
            st.setString(3, pat.getNeighborhood());
            st.setString(4, pat.getAddress());
            st.setString(5, pat.getCity());
            st.setString(6, pat.getEmail());
            st.setString(7, pat.getPhoneNumber());
            st.setString(8, pat.getPassword());
            st.setInt(9, pat.getIdentification());
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
    public void delete(int id) {
        try {
            this.establishConnection();
            PreparedStatement st = this.conect.prepareStatement("DELETE FROM patient WHERE identification = ?;");
            st.setInt(1, id);
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
    public String ecnode(String passEncrypt) {
         String secretKey = "#1PaSsWoRd1#";
        String encrypt = "";
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] llavePassword = md5.digest(secretKey.getBytes("utf-8"));
            byte[] BytesKey = Arrays.copyOf(llavePassword, 24);
            SecretKey key = new SecretKeySpec(BytesKey, "DESede");
            Cipher cifrado = Cipher.getInstance("DESede");
            cifrado.init(Cipher.ENCRYPT_MODE, key);
            byte[] plainTextBytes = passEncrypt.getBytes("utf-8");
            byte[] buf = cifrado.doFinal(plainTextBytes);
            byte[] base64Bytes = Base64.encodeBase64(buf);
            encrypt = new String(base64Bytes);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Encryption error: "+ex.toString());
        }
        return encrypt;
    }

    @Override
    public String deecnode(String passDecrypt) {
        String secretKey = "!2pAsSwOrD2!";
         String decrypt = "";
        try {
            byte[] message = Base64.decodeBase64(passDecrypt.getBytes("utf-8"));
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md5.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
            SecretKey key = new SecretKeySpec(keyBytes, "DESede");
            Cipher decipher = Cipher.getInstance("DESede");
            decipher.init(Cipher.DECRYPT_MODE, key);
            byte[] plainText = decipher.doFinal(message);
            decrypt = new String(plainText, "UTF-8");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error decrypting: "+ex.toString());
        }
        return decrypt;
    }

    @Override
    public Patient ValidatePatient(int id, String pass)  {
         Patient pat = null;
        
        try {
            this.establishConnection();
            PreparedStatement st = this.conect.prepareStatement("SELECT firstNames,license FROM patient WHERE identification = ? AND password = ? LIMIT 1;");
            st.setInt(1, id);
            st.setString(2, pass);
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                pat = new Patient();
                pat.setFirstNames(rs.getString("firstNames"));
                pat.setLicense(rs.getInt("license"));
                JOptionPane.showConfirmDialog(null, "Welcome");
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
    public void updateLicense(int license,int id) {
        try {
            this.establishConnection();
            PreparedStatement st = this.conect.prepareStatement("UPDATE patient SET license = ? WHERE identification = ?;");
            

            st.setInt(1, license);
            st.setInt(2, id);
            
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
}

   
    

