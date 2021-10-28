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
public class GenericData <T>{
T data1  ;     

GenericData(T data){
    data1 = data;
}

void CetakData(){
    int num;
    num = (int)data1;
    System.out.println(num);   
}
    
}
