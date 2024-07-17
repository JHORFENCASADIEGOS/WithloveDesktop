/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.withlove.main;

import com.withlove.db.connection;
import com.withlove.view.login;

/**
 *
 * @author USER
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
        /* connection cone = new connection();
        cone.establishConnection(); */
        login log = new login();
        log.setVisible(true);
        log.setResizable(false);
        log.setLocationRelativeTo(null); 
        
    }
    
}
