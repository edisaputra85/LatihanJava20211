package com.mycompany.project_collection;

import java.util.HashMap;

public class CollectionHashMap {
    public static void main(String[] args) {
        HashMap<String,String> Fruits = new HashMap<>();
        //tambah data
        Fruits.put("Apple","Green");
        Fruits.put("Oranges","Orange");
        Fruits.put("Tomato","Red");
        
        System.out.println(Fruits);
        System.out.println(Fruits.get("Tomato"));
        
        tampilkanData(Fruits);
        
    }
    
    static void tampilkanData(HashMap<String,String> fruitBowl){
        for (HashMap.Entry<String, String> fruit : fruitBowl.entrySet())    
            {
            System.out.println("Fruit: " + fruit.getKey()
            +" - Color: "+fruit.getValue());
            }//endfor
    }
    
}
