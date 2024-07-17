/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.withlove.model;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author SENA
 */
public class Appointment {
    
     private Long idAppointment;
    private Long idProfessional;
    private String identification;
    private String codeCase;
    private String descriptionAppoin;
    private LocalDate dateAvailable;
    private LocalTime hourAvailable;
    private String address;
    private String phoneNumberClinic;

    public Appointment() {
    }

    public Appointment(Long idAppointment, Long idProfessional, String identification, String codeCase, String descriptionAppoin, LocalDate dateAvailable, LocalTime hourAvailable, String address, String phoneNumberClinic) {
        this.idAppointment = idAppointment;
        this.idProfessional = idProfessional;
        this.identification = identification;
        this.codeCase = codeCase;
        this.descriptionAppoin = descriptionAppoin;
        this.dateAvailable = dateAvailable;
        this.hourAvailable = hourAvailable;
        this.address = address;
        this.phoneNumberClinic = phoneNumberClinic;
    }

    
    
    public Long getIdAppointment() {
        return idAppointment;
    }

    public void setIdAppointment(Long idAppointment) {
        this.idAppointment = idAppointment;
    }

    public Long getIdProfessional() {
        return idProfessional;
    }

    public void setIdProfessional(Long idProfessional) {
        this.idProfessional = idProfessional;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getCodeCase() {
        return codeCase;
    }

    public void setCodeCase(String codeCase) {
        this.codeCase = codeCase;
    }

    public String getDescriptionAppoin() {
        return descriptionAppoin;
    }

    public void setDescriptionAppoin(String descriptionAppoin) {
        this.descriptionAppoin = descriptionAppoin;
    }

    public LocalDate getDateAvailable() {
        return dateAvailable;
    }

    public void setDateAvailable(LocalDate dateAvailable) {
        this.dateAvailable = dateAvailable;
    }

    public LocalTime getHourAvailable() {
        return hourAvailable;
    }

    public void setHourAvailable(LocalTime hourAvailable) {
        this.hourAvailable = hourAvailable;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumberClinic() {
        return phoneNumberClinic;
    }

    public void setPhoneNumberClinic(String phoneNumberClinic) {
        this.phoneNumberClinic = phoneNumberClinic;
    }
}
