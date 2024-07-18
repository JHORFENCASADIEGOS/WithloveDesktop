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
import com.withlove.model.Appointment;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AppointmentDAOImpl extends connection implements appointmentDAO {

    @Override
    public void create(Appointment app) {
        try {
            this.establishConnection();
            PreparedStatement st = this.conect.prepareStatement("INSERT INTO appointment (idProfessional, identification, codeCase, descriptionAppoin, dateAvailable, hourAvailable, address, phoneNumberClinic) VALUES(?,?,?,?,?,?,?,?);");
            st.setLong(1, app.getIdProfessional());
            st.setString(2, app.getIdentification());
            st.setString(3, app.getCodeCase());
            st.setString(4, app.getDescriptionAppoin());
            st.setDate(5, java.sql.Date.valueOf(app.getDateAvailable()));
            st.setTime(6, java.sql.Time.valueOf(app.getHourAvailable()));
            st.setString(7, app.getAddress());
            st.setString(8, app.getPhoneNumberClinic());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error: " + e.toString());
        } finally {
            try {
                this.closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(AppointmentDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public Appointment searchForId(String id) {
        Appointment app = null;

        try {
            this.establishConnection();
            PreparedStatement st = this.conect.prepareStatement("SELECT * FROM appointment WHERE identification = ? LIMIT 1;");
            st.setString(1, id);

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                app = new Appointment();
                app.setIdAppointment(rs.getLong("idAppointment"));
                app.setIdProfessional(rs.getLong("idProfessional"));
                app.setIdentification(rs.getString("identification"));
                app.setCodeCase(rs.getString("codeCase"));
                app.setDescriptionAppoin(rs.getString("descriptionAppoin"));
                app.setDateAvailable(rs.getDate("dateAvailable").toLocalDate());
                app.setHourAvailable(rs.getTime("hourAvailable").toLocalTime());
                app.setAddress(rs.getString("address"));
                app.setPhoneNumberClinic(rs.getString("phoneNumberClinic"));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error: " + e.toString());
        } finally {
            try {
                this.closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(AppointmentDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return app;
    }

    @Override
    public void update(Appointment app) {
        try {
            this.establishConnection();
            PreparedStatement st = this.conect.prepareStatement("UPDATE appointment SET idProfessional = ?, identification = ?, codeCase = ?, descriptionAppoin = ?, dateAvailable = ?, hourAvailable = ?, address = ?, phoneNumberClinic = ? WHERE idAppointment = ?;");
            st.setLong(1, app.getIdProfessional());
            st.setString(2, app.getIdentification());
            st.setString(3, app.getCodeCase());
            st.setString(4, app.getDescriptionAppoin());
            st.setDate(5, java.sql.Date.valueOf(app.getDateAvailable()));
            st.setTime(6, java.sql.Time.valueOf(app.getHourAvailable()));
            st.setString(7, app.getAddress());
            st.setString(8, app.getPhoneNumberClinic());
            st.setLong(9, app.getIdAppointment());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error: " + e.toString());
        } finally {
            try {
                this.closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(AppointmentDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void delete(Long id) {
        try {
            this.establishConnection();
            PreparedStatement st = this.conect.prepareStatement("DELETE FROM appointment WHERE idAppointment = ?;");
            st.setLong(1, id);
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error: " + e.toString());
        } finally {
            try {
                this.closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(AppointmentDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public List<Appointment> getAll() {
        List<Appointment> appointmentList = new ArrayList<>();

        try {
            this.establishConnection();
            PreparedStatement st = this.conect.prepareStatement("SELECT * FROM appointment;");

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Appointment app = new Appointment();
                app.setIdAppointment(rs.getLong("idAppointment"));
                app.setIdProfessional(rs.getLong("idProfessional"));
                app.setIdentification(rs.getString("identification"));
                app.setCodeCase(rs.getString("codeCase"));
                app.setDescriptionAppoin(rs.getString("descriptionAppoin"));
                app.setDateAvailable(rs.getDate("dateAvailable").toLocalDate());
                app.setHourAvailable(rs.getTime("hourAvailable").toLocalTime());
                app.setAddress(rs.getString("address"));
                app.setPhoneNumberClinic(rs.getString("phoneNumberClinic"));
                appointmentList.add(app);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error: " + e.toString());
        } finally {
            try {
                this.closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(AppointmentDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return appointmentList;
    }
}

