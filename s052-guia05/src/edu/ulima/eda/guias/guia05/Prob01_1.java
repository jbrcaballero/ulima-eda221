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
public class Prob01_1 {
    public static int countElements(LinkedList list){
        int count = 0;
        Node ptr = list.getL();
        while(ptr != null){
            count = count + 1;
            ptr = ptr.next();
        }
        return count;
    }
    public static void main(String[] args) {
        //Crear la lista
        LinkedList list = new LinkedList();
        //Agregar valores
        list.addFirst(100);
        list.addFirst(50);
        list.addFirst(880);
        list.addLast(44);
        list.addFirst(77);
        list.showElements();
        System.out.println("Cantidad de elementos: " + countElements(list));
    }
    

}
