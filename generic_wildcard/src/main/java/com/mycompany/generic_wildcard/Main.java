/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.generic_wildcard;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        GMC gmc = new GMC();
        ArrayList<Double> array1 = new ArrayList<Double>();
        array1.add(25.5);
        array1.add(34.9);
        array1.add(45.7);
        gmc.printList(array1);
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        array2.add(10);
        array2.add(20);
        array2.add(30);
        gmc.printList(array2);
    }   
}
