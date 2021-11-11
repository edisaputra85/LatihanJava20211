/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project_collection;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class CollectionArrayList {
    public static void main(String[] args) {
        ArrayList<String> namaMahasiswa = new ArrayList<>();
        namaMahasiswa.add("Vin Diesel");//data indeks ke-0
        namaMahasiswa.add("Jason Statham");//data indeks ke-1
        namaMahasiswa.add("Dwyne Johnson");//data indeks ke-2
        namaMahasiswa.add("Dwyne Johnson");//data indeks ke-2
        
        TampilkanData(namaMahasiswa);
        System.out.println("Jumlah data: " + namaMahasiswa.size());
        
        namaMahasiswa.remove(0);
        TampilkanData(namaMahasiswa);
        namaMahasiswa.add(0,"Vin Diesel");//data indeks ke-0
        TampilkanData(namaMahasiswa);
    }
    
    static void TampilkanData(ArrayList<String> arrayList){
        for (int i=0; i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }
}


/*public static void main(String[] args) {
        //ArrayList StudentName
        ArrayList<String> studentName = new ArrayList<String>();
        studentName.
    }
    
    static void addStudents(ArrayList<String> arrayList){
        arrayList.add("Vin Diesel");
        arrayList.add("Dwyne Johnson");
        arrayList.add("Jason Statham");
    }
    
    static void displayStudents(ArrayList<String> arrayList){
        for (String name: arrayList){
            System.out.println(name);
        }
    }
    */