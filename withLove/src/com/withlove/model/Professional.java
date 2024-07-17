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
    
    
    private Long idProfessional;
    private String identification;
    private String nameProfessional;
    private String lastNamePr;
    private String email;
    private String phoneNumberProf;
    private String passwordPro;
    private String profession;
    private Long idCategory;

    public Professional() {
    }

    public Professional(Long idProfessional, String identification, String nameProfessional, String lastNamePr, String email, String phoneNumberProf, String passwordPro, String profession, Long idCategory) {
        this.idProfessional = idProfessional;
        this.identification = identification;
        this.nameProfessional = nameProfessional;
        this.lastNamePr = lastNamePr;
        this.email = email;
        this.phoneNumberProf = phoneNumberProf;
        this.passwordPro = passwordPro;
        this.profession = profession;
        this.idCategory = idCategory;
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

    public String getNameProfessional() {
        return nameProfessional;
    }

    public void setNameProfessional(String nameProfessional) {
        this.nameProfessional = nameProfessional;
    }

    public String getLastNamePr() {
        return lastNamePr;
    }

    public void setLastNamePr(String lastNamePr) {
        this.lastNamePr = lastNamePr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumberProf() {
        return phoneNumberProf;
    }

    public void setPhoneNumberProf(String phoneNumberProf) {
        this.phoneNumberProf = phoneNumberProf;
    }

    public String getPasswordPro() {
        return passwordPro;
    }

    public void setPasswordPro(String passwordPro) {
        this.passwordPro = passwordPro;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Long getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Long idCategory) {
        this.idCategory = idCategory;
    } 
    

    
    
}
