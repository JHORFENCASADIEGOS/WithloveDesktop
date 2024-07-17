/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.withlove.model;

import java.time.LocalDate;

/**
 *
 * @author USER
 */
public class Patient {
    
     private Long idPatient;
    private String identification;
    private String namePatient;
    private String lastNamePa;
    private String email;
    private String phoneNumberPatient;
    private LocalDate birthdayDate;
    private Integer gender;
    private String passwordPatient;
    private String insurer;

    public Patient() {
    }

    public Patient(Long idPatient, String identification, String namePatient, String lastNamePa, String email, String phoneNumberPatient, LocalDate birthdayDate, Integer gender, String passwordPatient, String insurer) {
        this.idPatient = idPatient;
        this.identification = identification;
        this.namePatient = namePatient;
        this.lastNamePa = lastNamePa;
        this.email = email;
        this.phoneNumberPatient = phoneNumberPatient;
        this.birthdayDate = birthdayDate;
        this.gender = gender;
        this.passwordPatient = passwordPatient;
        this.insurer = insurer;
    }

    

    public Long getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(Long idPatient) {
        this.idPatient = idPatient;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getNamePatient() {
        return namePatient;
    }

    public void setNamePatient(String namePatient) {
        this.namePatient = namePatient;
    }

    public String getLastNamePa() {
        return lastNamePa;
    }

    public void setLastNamePa(String lastNamePa) {
        this.lastNamePa = lastNamePa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumberPatient() {
        return phoneNumberPatient;
    }

    public void setPhoneNumberPatient(String phoneNumberPatient) {
        this.phoneNumberPatient = phoneNumberPatient;
    }

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(LocalDate birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getPasswordPatient() {
        return passwordPatient;
    }

    public void setPasswordPatient(String passwordPatient) {
        this.passwordPatient = passwordPatient;
    }

    public String getInsurer() {
        return insurer;
    }

    public void setInsurer(String insurer) {
        this.insurer = insurer;
    }
    
    
    
    
}
