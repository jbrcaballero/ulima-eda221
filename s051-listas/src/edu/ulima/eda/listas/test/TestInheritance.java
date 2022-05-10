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

/*
    Extienda la funcionalidad de su clase Lista Enlazada para mostrar
    en pantalla solamente los valores impares que tenga.
*/

class EnhancedList extends LinkedList{
    public void showOdd(){
        Node ptr = this.getL();
        while(ptr != null){
            if(ptr.value() % 2 != 0){
                System.out.print(ptr.value() + " --> ");
            }            
            ptr = ptr.next();
        }
        System.out.println("null");
    }
}

public class TestInheritance {
    public static void main(String[] args){
        EnhancedList list = new EnhancedList();
        list.addFirst(12);
        list.addFirst(13);
        list.addLast(22);
        list.addLast(45);
        list.showElements();
        list.showOdd();
    }    
}
