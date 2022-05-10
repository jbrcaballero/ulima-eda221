/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.listas.test;

import edu.ulima.eda.listas.LinkedList;
import edu.ulima.eda.listas.Node;

/**
 *
 * @author JC
 */
public class TestList {
    
    public static int sum(LinkedList list){
        //Referencia al primer elemento
        Node ptr = list.getL();
        //Variable acumuladora
        int suma = 0;
        //Recorrido
        while(ptr != null){
            suma = suma + ptr.value();
            ptr = ptr.next();
        }
        return suma;
    }
    
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addFirst(20);
        list.addFirst(60);
        list.addLast(44);
        list.addLast(65);
        list.showElements(); 
        list.addBefore(20, 80);
        list.showElements();
        list.remove(44);
        list.showElements();
        list.removeFirst();
        list.showElements();
        list.removeLast();
        list.showElements();
        
        
        System.out.println("Suma de elementos: " + sum(list));
    }
}
