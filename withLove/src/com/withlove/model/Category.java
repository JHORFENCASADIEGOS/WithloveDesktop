/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.withlove.model;

/**
 *
 * @author SENA
 */
public class Category {
    
    private Long idCategory;
    private String nameProfession;

    public Category() {
    }

    public Category(Long idCategory, String nameProfession) {
        this.idCategory = idCategory;
        this.nameProfession = nameProfession;
    }
    
    

    public Long getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Long idCategory) {
        this.idCategory = idCategory;
    }

    public String getNameProfession() {
        return nameProfession;
    }

    public void setNameProfession(String nameProfession) {
        this.nameProfession = nameProfession;
    }
}
