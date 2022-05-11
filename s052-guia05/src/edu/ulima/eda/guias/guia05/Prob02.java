/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.guias.guia05;

import edu.ulima.eda.listas.LinkedList;
import edu.ulima.eda.listas.Node;

/**
 *
 * @author JC
 */
public class Prob02 {
    
    public static boolean equals(LinkedList list1, LinkedList list2){
        //Obtener referencias para recorrer listas
        Node ptr1 = list1.getL();        
        Node ptr2 = list2.getL();        
        boolean ans = true;
        
        while(ptr1 != null && ptr2 != null){
            //Comparar elementos
            if(ptr1.value() != ptr2.value()){
                ans = false;
            }
            //Avanzar los punteros
            ptr1 = ptr1.next();
            ptr2 = ptr2.next();            
        }
        //Si los tamanos son diferentes, uno de ellos sera != null
        if(ptr1 != null || ptr2 != null){
            ans = false;
        }        
        return ans;
    }
    
    public static void main(String[] args){
        LinkedList list1 = new LinkedList();
        list1.addLast(30);
        list1.addLast(34);
        list1.addLast(36);
        list1.addLast(50);        
        
        LinkedList list2 = new LinkedList();
        list2.addLast(30);
        list2.addLast(34);
        list2.addLast(36);
        list2.addLast(50);
        list2.addLast(55);
        
        list1.showElements();
        list2.showElements();
        System.out.println(equals(list1, list2));
    }
}
