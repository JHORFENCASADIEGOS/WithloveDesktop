/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.withlove.DAO;

import com.withlove.db.connection;
import com.withlove.model.Professional;
import java.security.MessageDigest;
import java.sql.PreparedStatement;
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
public class ProfessionalDAOImpl extends connection implements professionalDAO{


    @Override
    public void create(Professional pro){
        try {
            this.establishConnection();
            PreparedStatement st = this.conect.prepareStatement("INSERT INTO professional (identification, firstNames, surNames, neighborhood, address, city, email, phoneNumber, password, study_name, general_information)  VALUES(?,?,?,?,?,?,?,?,?,?,?);");
            st.setInt(1, pro.getIdentification());
            st.setString(2, pro.getFirstNames());
            st.setString(3, pro.getSurNames());
            st.setString(4, pro.getNeighborhood());
            st.setString(5, pro.getAddress());
            st.setString(6, pro.getCity());
            st.setString(7, pro.getEmail());
            st.setString(8, pro.getPhoneNumber());
            st.setString(9, pro.getPassword());
            st.setString(10, pro.getStudy_name());
            st.setString(11, pro.getGeneral_information());
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
           JOptionPane.showConfirmDialog(null, "Error: "+e.toString());
        } finally {
            try {
                this.closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(ProfessionalDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public Professional searchForId(int id)  {
        Professional pro = null;
        
        try {
            this.establishConnection();
            PreparedStatement st = this.conect.prepareStatement("SELECT * FROM professional WHERE identification = ? LIMIT 1;");
            st.setInt(1, id);
            
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                pro = new Professional();
                pro.setIdentification(rs.getInt("identification"));
                pro.setIdProfessional(rs.getInt("idProfessional"));
                pro.setFirstNames(rs.getString("firstNames"));
                pro.setSurNames(rs.getString("surNames"));
                pro.setNeighborhood(rs.getString("neighborhood"));
                pro.setAddress(rs.getString("address"));
                pro.setCity(rs.getString("city"));
                pro.setEmail(rs.getString("email"));
                pro.setPhoneNumber(rs.getString("phoneNumber"));
                pro.setPassword(rs.getString("password"));
                pro.setStudy_name(rs.getString("study_name"));
                pro.setGeneral_information(rs.getString("general_information"));
            }
            rs.close();
            st.close();
        } catch(Exception e) {
            JOptionPane.showConfirmDialog(null, "Error: "+e.toString());
        } finally {
            try {
                this.closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(ProfessionalDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return pro;
    }

    @Override
    public void update(Professional pro) {
         try {
            this.establishConnection();
            PreparedStatement st = this.conect.prepareStatement("UPDATE professional SET firstNames = ?, surNames = ?, neighborhood = ?, address = ?, city = ?, email = ?, phoneNumber = ?, password = ?, study_name = ?, general_information= ? WHERE identification = ?;");
           

            st.setString(1, pro.getFirstNames());
            st.setString(2, pro.getSurNames());
            st.setString(3, pro.getNeighborhood());
            st.setString(4, pro.getAddress());
            st.setString(5, pro.getCity());
            st.setString(6, pro.getEmail());
            st.setString(7, pro.getPhoneNumber());
            st.setString(8, pro.getPassword());
            st.setString(9, pro.getStudy_name());
            st.setString(10, pro.getGeneral_information());
            st.setInt(11, pro.getIdentification());
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
            JOptionPane.showConfirmDialog(null, "Error: "+e.toString());
        } finally {
             try {
                 this.closeConnection();
             } catch (SQLException ex) {
                 Logger.getLogger(ProfessionalDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
             }
        }    
    }

    @Override
    public void delete(int id)  {
        try {
            this.establishConnection();
            PreparedStatement st = this.conect.prepareStatement("DELETE FROM professional WHERE identification = ?;");
            st.setInt(1, id);
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
            JOptionPane.showConfirmDialog(null, "Error: "+e.toString());
        } finally {
            try {
                this.closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(ProfessionalDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
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
    public Professional ValidateProfessional(int id, String pass) {
        Professional pro = null;
        
        try {
            this.establishConnection();
            PreparedStatement st = this.conect.prepareStatement("SELECT firstNames, license FROM professional WHERE identification = ? AND password = ? LIMIT 1;");
            st.setInt(1, id);
            st.setString(2, pass);
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                pro = new Professional();
                
                pro.setFirstNames(rs.getString("firstNames"));
                pro.setLicense(rs.getInt("license"));
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
                Logger.getLogger(ProfessionalDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return pro;
    }

    @Override
    public void updateLicense(int license, int id) {
         try {
            this.establishConnection();
            PreparedStatement st = this.conect.prepareStatement("UPDATE professional SET license = ? WHERE identification = ?;");
            

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
