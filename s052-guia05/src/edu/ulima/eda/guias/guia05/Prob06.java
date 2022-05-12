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
public class Prob06 {
    
    public static LinkedList merge(LinkedList list1, LinkedList list2){
        Node ptr1 = list1.getL();
        Node ptr2 = list2.getL();
        
        LinkedList ans = new LinkedList();
               
        while(ptr1 != null || ptr2 != null){                        
            if(ptr1 != null){
                ans.addLast(ptr1.value());
                ptr1 = ptr1.next();
            }
            if(ptr2 != null){
                ans.addLast(ptr2.value());
                ptr2 = ptr2.next();
            }
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
        list2.addLast(12);
        list2.addLast(18);
        list2.addLast(21);
        list2.addLast(28);
        list2.addLast(5);
        list2.addLast(120);
        
        list1.showElements();
        list2.showElements();
        
        LinkedList list3 = merge(list1, list2);
        list3.showElements();
    }
}
