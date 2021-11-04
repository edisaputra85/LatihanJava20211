/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.generic_wildcards;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class GenericMethodClass {
    //method non-static
    void printList(ArrayList<?> list){
        for(Object element: list){
            System.out.println(element);
        }
        System.out.println("");    
    }
    
    public double sumOfList(ArrayList<? extends Number> arrayList) {
        double s = 0.0;
        for (Number n : arrayList)
        s += n.doubleValue();
        //endfor
        return s;
    }//end method sumOfList
    
    public void addNumbers(ArrayList<? super Integer> arrayList) {
        for (int i = 1; i <= 10; i++) {
        arrayList.add(i);
        }//endfor
    }//end method addNumber
}
