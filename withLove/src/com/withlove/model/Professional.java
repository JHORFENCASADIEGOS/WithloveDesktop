/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.withlove.model;

/**
 *
 * @author USER
 */
public class Professional {
    
    
     private int identification;
    private int idProfessional;
    private String firstNames;
    private String surNames;
    private String neighborhood;
    private String address;
    private String city;
    private String email;
    private String phoneNumber;
    private String password;   
    private String study_name;
    private String general_information;
    private int license;

    public Professional() {
    }

    public Professional(int identification, String firstNames, String surNames, String neighborhood, String address, String city, String email, String phoneNumber, String password, String study_name, String general_information) {
        this.identification = identification;
        this.firstNames = firstNames;
        this.surNames = surNames;
        this.neighborhood = neighborhood;
        this.address = address;
        this.city = city;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.study_name = study_name;
        this.general_information = general_information;
    }

    public Professional(String firstNames, int license) {
        this.firstNames = firstNames;
        this.license = license;
    }

    
    
    
    public int getLicense() {
        return license;
    }

    public void setLicense(int license) {
        this.license = license;
    }

    
    public int getIdProfessional() {
        return idProfessional;
    }

    public void setIdProfessional(int idProfessional) {
        this.idProfessional = idProfessional;
    }

    public int getIdentification() {
        return identification;
    }

    public void setIdentification(int identification) {
        this.identification = identification;
    }

    public String getFirstNames() {
        return firstNames;
    }

    public void setFirstNames(String firstNames) {
        this.firstNames = firstNames;
    }

    public String getSurNames() {
        return surNames;
    }

    public void setSurNames(String surNames) {
        this.surNames = surNames;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStudy_name() {
        return study_name;
    }

    public void setStudy_name(String study_name) {
        this.study_name = study_name;
    }

    public String getGeneral_information() {
        return general_information;
    }

    public void setGeneral_information(String general_information) {
        this.general_information = general_information;
    }

    
    
}
