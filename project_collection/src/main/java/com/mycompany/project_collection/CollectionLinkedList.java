/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project_collection;

import java.util.LinkedList;

/**
 *
 * @author LENOVO
 */
public class CollectionLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        //LIFO
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        
        System.out.println(linkedList);
        
        linkedList.pop();
        System.out.println(linkedList);
        
    }
    
}
