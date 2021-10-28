/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project_generic_class;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        //sintaks membuat objek dari class generic
        GenericData<String,Boolean> myData = new GenericData<>();
        myData.setData("Ini String",true);
        
        //sintaks membuat objek dari class generic
        GenericData<Integer,Boolean> yourData = new GenericData<>();
        yourData.setData(5,false);    
    }
}

