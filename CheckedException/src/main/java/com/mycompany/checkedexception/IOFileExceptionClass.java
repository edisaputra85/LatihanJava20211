/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.checkedexception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class IOFileExceptionClass {
    //class ini berisi demo checkedexception
    public static void main(String[] args) {
        File dataHewan = new File ("C://datahewan.txt");       
        
        try{
          FileReader baca = new FileReader(dataHewan);  
          System.out.println("File ada");
        }
        catch(FileNotFoundException e){
            System.out.println("File tidak ditemukan"); 
        }
        
        System.out.println("Selesai");
    }
    
}
