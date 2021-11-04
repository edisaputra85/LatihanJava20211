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
    
}
