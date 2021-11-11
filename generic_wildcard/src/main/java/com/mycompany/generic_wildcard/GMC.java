/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.generic_wildcard;

import java.util.List;

/**
 *
 * @author LENOVO
 */
public class GMC {
    public void printList(List<?> list) {
        for (Object elem: list)
        System.out.println(elem);
        //endfor
        System.out.println();
    }//end method printList
}
