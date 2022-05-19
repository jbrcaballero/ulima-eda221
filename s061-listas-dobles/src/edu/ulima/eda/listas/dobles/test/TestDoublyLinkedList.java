/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.listas.dobles.test;

import edu.ulima.eda.listas.dobles.DoublyLinkedList;

/**
 *
 * @author JC
 */
public class TestDoublyLinkedList {
    public static void main(String args[]){
        //Instanciar lista
        DoublyLinkedList list = new DoublyLinkedList();
        
        //Agregar elementos
        list.addFirst(13);
        list.addFirst(17);
        list.addFirst(88);
        
        list.addLast(76);
        list.addLast(55);
        list.addLast(99);
        
        list.show();
        list.showReverse();

    }
}
