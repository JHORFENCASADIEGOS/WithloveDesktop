/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.withlove.DAO;

/**
 *
 * @author USER
 */
import com.withlove.db.connection;
import com.withlove.model.Category;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CategoryDAOImpl extends connection implements categoryDAO {


    @Override
    public void create(Category cat) {
        try {
            this.establishConnection();
            PreparedStatement st = this.conect.prepareStatement("INSERT INTO category (nameProfession) VALUES(?);");
            st.setString(1, cat.getNameProfession());
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
            JOptionPane.showConfirmDialog(null, "Error: " + e.toString());
        } finally {
            try {
                this.closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(CategoryDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public Category searchForId(String id) {
        Category cat = null;
        
        try {
            this.establishConnection();
            PreparedStatement st = this.conect.prepareStatement("SELECT * FROM category WHERE idCategory = ? LIMIT 1;");
            st.setString(1, id);
            
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                cat = new Category();
                cat.setIdCategory(rs.getLong("idCategory"));
                cat.setNameProfession(rs.getString("nameProfession"));
            }
            rs.close();
            st.close();
        } catch(Exception e) {
            JOptionPane.showConfirmDialog(null, "Error: " + e.toString());
        } finally {
            try {
                this.closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(CategoryDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return cat;
    }

    @Override
    public void update(Category cat) {
        try {
            this.establishConnection();
            PreparedStatement st = this.conect.prepareStatement("UPDATE category SET nameProfession = ? WHERE idCategory = ?;");
            st.setString(1, cat.getNameProfession());
            st.setLong(2, cat.getIdCategory());
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
            JOptionPane.showConfirmDialog(null, "Error: " + e.toString());
        } finally {
            try {
                this.closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(CategoryDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void delete(Long id) {
        try {
            this.establishConnection();
            PreparedStatement st = this.conect.prepareStatement("DELETE FROM category WHERE idCategory = ?;");
            st.setLong(1, id);
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
            JOptionPane.showConfirmDialog(null, "Error: " + e.toString());
        } finally {
            try {
                this.closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(CategoryDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public List<Category> getAll() {
        List<Category> categoryList = new ArrayList<>();
        
        try {
            this.establishConnection();
            PreparedStatement st = this.conect.prepareStatement("SELECT * FROM category;");
            
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                Category cat = new Category();
                cat.setIdCategory(rs.getLong("idCategory"));
                cat.setNameProfession(rs.getString("nameProfession"));
                categoryList.add(cat);
            }
            rs.close();
            st.close();
        } catch(Exception e) {
            JOptionPane.showConfirmDialog(null, "Error: " + e.toString());
        } finally {
            try {
                this.closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(CategoryDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return categoryList;
    }
}
