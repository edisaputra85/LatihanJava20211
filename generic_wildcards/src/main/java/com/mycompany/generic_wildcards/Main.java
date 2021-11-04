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
public class Main {
    public static void main(String[] args) {
        //instansiasi object gmc
        GenericMethodClass gmc = new GenericMethodClass();
        //instansiasi objek array1
        ArrayList<Double> array1 = new ArrayList<Double>();
        array1.add(25.5);
        array1.add(34.9);
        array1.add(45.7);
        //menampilkan data array1
        gmc.printList(array1);
        System.out.println(gmc.sumOfList(array1));
        
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        array2.add(10);
        array2.add(20);
        array2.add(30);
        gmc.printList(array2);
        System.out.println((int) gmc.sumOfList(array2));
        
        ArrayList<Integer> listInteger = new ArrayList<>();
        gmc.addNumbers(listInteger);
        gmc.printList(listInteger);
        
        ArrayList<Number> listNumber = new ArrayList<>();
        gmc.addNumbers(listNumber);
        gmc.printList(listNumber);
    }
    
}
