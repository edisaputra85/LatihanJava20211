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
public class GenericData <T1,T2>{
T1 data1  ; 
T2 data2;
T2 data3;
void setData(T1 data1, T2 data2){
    this.data1 = data1;
    this.data2 = data2;
}

<E> void CetakData(E inputData){
    System.out.println(inputData); 
}    
}
