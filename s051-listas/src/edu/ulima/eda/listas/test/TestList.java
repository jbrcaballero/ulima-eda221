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
    //Implemente un programa que permita mostrar la suma de elementos
    //de una lista enlazada
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
    
    //Implemente un programa que reciba una lista enlazada y muestre
    //en pantalla solamente a aquellos nodos con valores impares asociados
    public static void showOddElements(LinkedList list){
        //ptr sera una referencia al primer elemento de la lista enlazada
        Node ptr = list.getL();
        //ptr sera la variable auxiliar que me permitira recorrer la lista
        while(ptr != null){
            //La variable item almacenara el valor asociado al nodo
            int item = ptr.value();
            //Si el valor del nodo es impar
            if(item % 2 != 0){
                //Mostramos en pantalla el valor del nodo
                System.out.println(item);
            }
            //Desplazamos "ptr" para que apunte al siguiente nodo de la lista
            ptr = ptr.next();
        }
    }
    
    public static void main(String[] args){
        //Instanciar la lista enlazada
        LinkedList list = new LinkedList();
        //Agregar elementos al inicio
        list.addFirst(21);
        list.addFirst(60);
        //Agregar elementos al final
        list.addLast(44);
        list.addLast(65);
        list.showElements(); 
        //Agregar un nodo con el valor 80 antes del nodo con valor 20
        list.addBefore(20, 80);
        list.showElements();
        showOddElements(list);
        /*
        //Eliminar el nodo con el valor 44
        list.remove(44);
        list.showElements();
        //Eliminar el primer nodo
        list.removeFirst();
        list.showElements();
        //Eliminar el ultimo nodo
        list.removeLast();
        list.showElements();
        
        System.out.println("Suma de elementos: " + sum(list));
        */
    }
}
