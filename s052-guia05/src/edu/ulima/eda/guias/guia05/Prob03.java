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
public class Prob03 {
    public static LinkedList merge(LinkedList list1, LinkedList list2){
        //Representa la lista con todos los elementos
        LinkedList mergedList = new LinkedList();
        //Obtenemos una referencia al primer nodo de la primera lista
        Node ptr = list1.getL();
        //Recorremos la lista
        while(ptr != null){
            //Obtenemos el valor almacenado en el nodo
            int number = ptr.value();
            //Agregar el valor al final de la lista de respuesta
            mergedList.addLast(number);
            ptr = ptr.next();
        }
        //Repetimos el procedimiento para la lista 2
        //Tarea: Evitar repeticion a traves de la creacion de un metodo
        ptr = list2.getL();
        while(ptr != null){
            int number = ptr.value();
            mergedList.addLast(number);
            ptr = ptr.next();
        }        
        
        return mergedList;
    }
    
    public static void main(String[] args){
        LinkedList list1 = new LinkedList();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);
        list1.showElements();
        
        LinkedList list2 = new LinkedList();
        list2.addLast(4);
        list2.addLast(5);
        list2.addLast(6);
        list2.showElements();
        
        LinkedList mergedList = merge(list1, list2);
        mergedList.showElements();
    }
}
