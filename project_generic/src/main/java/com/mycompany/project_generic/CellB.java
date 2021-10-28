/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project_generic;

/**
 *
 * @author LENOVO
 */
public class CellB {
    int intData;
    String strData;
    //contoh overloading method (polimorfisme)
    public void setData(int intData){
        this.intData = intData;
    }
    public void setData(String strData){
        this.strData = strData;
    }
    
}
