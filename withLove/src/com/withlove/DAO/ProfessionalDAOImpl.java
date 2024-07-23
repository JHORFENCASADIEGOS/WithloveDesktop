/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.withlove.DAO;

import com.withlove.db.connection;
import com.withlove.model.Professional;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class ProfessionalDAOImpl extends connection implements professionalDAO{


   @Override
    public void create(Professional pro){
        try {
            this.establishConnection();
            PreparedStatement st = this.conect.prepareStatement("INSERT INTO professional (identification, nameProfessional, lastNamePr, email, phoneNumberProf, passwordPro, profession, idCategory)  VALUES(?,?,?,?,?,?,?,?);");
            st.setString(1, pro.getIdentification());
            st.setString(2, pro.getNameProfessional());
            st.setString(3, pro.getLastNamePr());
            st.setString(4, pro.getEmail());
            st.setString(5, pro.getPhoneNumberProf());
            st.setString(6, pro.getPasswordPro());
            st.setString(7, pro.getProfession());
            st.setLong(8, (pro.getIdCategory()));
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
    public Professional searchForId(String id)  {
        Professional pro = null;
        
        try {
            this.establishConnection();
            PreparedStatement st = this.conect.prepareStatement("SELECT * FROM professional WHERE identification = ? LIMIT 1;");
            st.setString(1, id);
            
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                pro = new Professional();
                pro.setIdProfessional(rs.getLong("idProfessional"));
                pro.setIdentification(rs.getString("identification"));              
                pro.setNameProfessional(rs.getString("nameProfessional"));
                pro.setLastNamePr(rs.getString("lastNamePr"));
                pro.setEmail(rs.getString("email"));
                pro.setPhoneNumberProf(rs.getString("phoneNumberProf"));
                pro.setPasswordPro(rs.getString("passwordPro"));
                pro.setProfession(rs.getString("profession"));
                pro.setIdCategory(rs.getLong("idCategory"));              
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
            PreparedStatement st = this.conect.prepareStatement("UPDATE professional SET nameProfessional = ?, lastNamePr = ?, email = ?, phoneNumberProf = ?, passwordPro = ?, profession = ? , idCategory = ? WHERE identification = ?;");
            st.setString(1, pro.getNameProfessional());
            st.setString(2, pro.getLastNamePr());
            st.setString(3, pro.getEmail());
            st.setString(4, pro.getPhoneNumberProf());
            st.setString(5, pro.getPasswordPro());
            st.setString(6, pro.getProfession());
            st.setLong(7, (pro.getIdCategory()));
             st.setString(8, pro.getIdentification());
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
    public void delete(Long id)  {
        try {
            this.establishConnection();
            PreparedStatement st = this.conect.prepareStatement("DELETE FROM professional WHERE idProfessional = ?;");
            st.setLong(1, id);
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
    public Professional ValidateProfessional(String id, String pass) {
        Professional pro = null;
        
        try {
            this.establishConnection();
            PreparedStatement st = this.conect.prepareStatement("SELECT * FROM professional WHERE identification = ? AND passwordPro = ? LIMIT 1;");
            st.setString(1, id);
            st.setString(2, pass);
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                pro = new Professional();                                
                pro.setIdProfessional(rs.getLong("idProfessional"));
                pro.setIdentification(rs.getString("identification"));              
                pro.setNameProfessional(rs.getString("nameProfessional"));
                pro.setLastNamePr(rs.getString("lastNamePr"));
                pro.setEmail(rs.getString("email"));
                pro.setPhoneNumberProf(rs.getString("phoneNumberProf"));
                pro.setPasswordPro(rs.getString("passwordPro"));
                pro.setProfession(rs.getString("profession"));
                pro.setIdCategory(rs.getLong("idCategory"));
               
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
    public List<Professional> getAll() {
        List<Professional> professionalList = new ArrayList<>();
        
        try {
            this.establishConnection();
            PreparedStatement st = this.conect.prepareStatement("SELECT * FROM professional;");
            
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                Professional pro = new Professional();
                pro.setIdProfessional(rs.getLong("idProfessional"));
                pro.setIdentification(rs.getString("identification"));              
                pro.setNameProfessional(rs.getString("nameProfessional"));
                pro.setLastNamePr(rs.getString("lastNamePr"));
                pro.setEmail(rs.getString("email"));
                pro.setPhoneNumberProf(rs.getString("phoneNumberProf"));
                pro.setPasswordPro(rs.getString("passwordPro"));
                pro.setProfession(rs.getString("profession"));
                pro.setIdCategory(rs.getLong("idCategory"));
                professionalList.add(pro);
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
        return professionalList;
    }

    @Override
    public int countProfessional() {
         int count=0;
        try {
            this.establishConnection();
             PreparedStatement st = this.conect.prepareStatement("SELECT COUNT(*) FROM professional");
            
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                 count = rs.getInt(1); // Obtener el primer valor de la primera fila
               
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
