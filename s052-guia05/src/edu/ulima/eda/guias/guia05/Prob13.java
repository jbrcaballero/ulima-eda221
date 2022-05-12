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
public class Prob13 {
    
    public static int evaluate(LinkedList list){
        //Suma de nodos
        int count = 0;
        Node ptr = list.getL();
        //Recorrer la lista
        while(ptr.next() != null){
            count = count + 1;
            ptr = ptr.next();
        }        
        //Luego de finalizado el bucle, ptr apunta al ultimo elemento
        //Observese que no hemos contado al ultimo elemento
        if(ptr.value() > count + 1){
            return 1;
        }else if(ptr.value() < count + 1){
            return -1;
        }else{
            return 0;
        }
    }
    
    public static void main(String[] args){
        LinkedList list1 = new LinkedList();
        list1.addLast(30);
        list1.addLast(34);
        list1.addLast(36);
        list1.addLast(50);
        list1.addLast(4);
        list1.showElements();
        System.out.println(evaluate(list1));
    }
}
