/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.withlove.DAO;



/**
 *
 * @author USER
 */
public interface CRUD<T> {
    
    
    void create(T t) ;
    T searchForId(int id) ;
    void update(T t) ;
    void delete(int id) ;
    





    
}
