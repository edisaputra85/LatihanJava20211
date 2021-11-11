/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project_collection;

import java.util.HashSet;

/**
 *
 * @author LENOVO
 */
public class CollectionHashSet {
    public static void main(String[] args) {
        HashSet<String> namaAktor = new HashSet<>();
        namaAktor.add("Vin Diesel");
        namaAktor.add("Jason Statham");
        namaAktor.add("Dwyne Johnson");
        namaAktor.add("Iko Uwais");
        Tampilkan(namaAktor);
        namaAktor.remove("Vin Diesel");
        Tampilkan(namaAktor);
    }
    
    static void Tampilkan (HashSet<String> namaAktor){
        for (String nama:namaAktor){
            System.out.println(nama);
        }
    }
    
}
