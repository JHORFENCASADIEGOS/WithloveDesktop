package com.withlove.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class connection {
    
    protected Connection conect;
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost/dbwithlove";
    private final String USER = "root";
    private final String PASS = "123456789";
    
    public void establishConnection() throws ClassNotFoundException {
        try {
            conect = DriverManager.getConnection(DB_URL, USER, PASS);
            Class.forName(JDBC_DRIVER);
            // JOptionPane.showConfirmDialog(null, "conexion exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showConfirmDialog(null, "conexion NO exitosa");
        }
    }
    
    public void closeConnection() throws SQLException{
        if (conect != null) {
            if (!conect.isClosed()) {
                conect.close();
               // JOptionPane.showConfirmDialog(null, "conexion se cerro");
            }
        }
    }
}