package com.withlove.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class connection {

    protected Connection conect;
    private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost/withlovedb?useSSL=false&allowPublicKeyRetrieval=true&characterEncoding=UTF-8";
    private final String USER = "root";
    private final String PASS = "";

    public void establishConnection() {
        try {
            conect = DriverManager.getConnection(DB_URL, USER, PASS);
           // JOptionPane.showConfirmDialog(null, "Conexión exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showConfirmDialog(null, "Conexión NO exitosa");
        }
    }

    public void closeConnection() throws SQLException {
        if (conect != null) {
            if (!conect.isClosed()) {
                conect.close();
                //JOptionPane.showConfirmDialog(null, "Conexión se cerró");
            }
        }
    }
}
