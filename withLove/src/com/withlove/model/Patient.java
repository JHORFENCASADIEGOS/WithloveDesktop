/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.withlove.model;

/**
 *
 * @author USER
 */
public class Patient {
    
    private int identification;
    private int idPatient;
    private String firstNames;
    private String surNames;
    private String neighborhood;
    private String address;
    private String city;
    private String email;
    private String phoneNumber;
    private String password;
    private int license;

    public Patient(int identification, String firstNames, String surNames, String neighborhood, String address, String city, String email, String phoneNumber, String password) {
        this.identification = identification;
        this.firstNames = firstNames;
        this.surNames = surNames;
        this.neighborhood = neighborhood;
        this.address = address;
        this.city = city;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public Patient(String firstNames, int license) {
        this.firstNames = firstNames;
        this.license = license;
    }

    

    public Patient() {
    }

    

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getLicense() {
        return license;
    }

    public void setLicense(int license) {
        this.license = license;
    }
    public int getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    
    
}
