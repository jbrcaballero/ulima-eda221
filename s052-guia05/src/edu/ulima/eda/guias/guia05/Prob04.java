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
public class Prob04 {
    
    public static LinkedList reverse(LinkedList list){
        LinkedList ans = new LinkedList();
        Node ptr = list.getL();
        while(ptr != null){
            ans.addFirst(ptr.value());
            ptr = ptr.next();
        }
        return ans;
    }
    
    public static void main(String[] args){
        LinkedList list1 = new LinkedList();
        list1.addLast(11);
        list1.addLast(23);
        list1.addLast(54);
        list1.addLast(65);
        list1.showElements();
        
        LinkedList list2 = reverse(list1);
        list2.showElements();
    }
}
