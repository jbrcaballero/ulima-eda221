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
        //Almacenaremos el conteo en la variable count
        int count = 0;
        //Obtenemos una referencia al primer elemento de la lista
        //Lo almacenamos en la variable "ptr"
        Node ptr = list.getL();
        //Para recorrer la lista realizamos un bucle
        while(ptr != null){
            //Incrementar el contador de elementos
            count = count + 1;
            //Desplazamos "prt" al siguiente elemento
            ptr = ptr.next();
        }
        return count;
    }
    public static void main(String[] args) {
        //Crear lista (invocamos al constructor)
        LinkedList list = new LinkedList();
        //Agregar valores al inicio
        list.addFirst(12);
        list.addFirst(14);
        //Agregar valores al final
        list.addLast(16);
        list.addLast(22);
        //Agregar nuevamente al inicio
        list.addFirst(26);
        //Agregar el nodo con valor 55 antes del nodo con valor 16
        list.addBefore(16, 55);
        
        list.addLast(80);
        list.addLast(120);
        
        list.showElements();     
        System.out.println("Cantidad de elementos: " + countElements(list));
    }
}
