/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project_generic;

public class Main {
    public static void main(String[] args) {
/*        
//Menggunakan overloading
        CellB cellZ = new CellB();
        cellZ.setData(1);
        CellB cellw = new CellB();
        cellw.setData("Ini String");
        
        //Menggunakan Objek
        //Proses 1
        CellA cellX = new CellA();
        cellX.setData(1);
        System.out.println(cellX.getData());
        
        CellA cellY = new CellA();
        cellY.setData("Ini String");
        System.out.println(cellX.getData());
        
        //Proses 2 -> terjadi runtime exception
        int num = (int) cellY.getData();
        System.out.println(num);
   */
    CetakData("Ini String Lima");
    CetakData(5);
    //CetakData(true);
        
    }
    
    static void CetakData(Object data){
        int num;
        num = (int)data;
        System.out.println(num);
    }
    
}
