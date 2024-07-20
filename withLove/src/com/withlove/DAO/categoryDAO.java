/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.withlove.DAO;

import com.withlove.model.Category;

/**
 *
 * @author USER
 */
public interface categoryDAO extends CRUD<Category>{
    
    public int countCategory();
}
