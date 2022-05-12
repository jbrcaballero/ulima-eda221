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

class ListP10 extends LinkedList{
    public int size(){
        int count = 0;
        Node ptr = this.getL();
        while(ptr != null){
            count = count + 1;
            ptr = ptr.next();
        }        
        return count;
    }   
            
    public void removeSecondLast(){
        //Si tiene solo 2 elementos, el primero sera el penultimo
        if(this.size() == 2){
            //Eliminar el primer elemento
            this.removeFirst();
        }else if(this.size() > 2){
            //Cuando hay mas de dos elementos, recorremos buscando el antepenultimo
            Node ptr = this.getL();
            while(ptr.next().next().next() != null){
                ptr = ptr.next();
            }
            //El elemento sucesor del antepenultimo (ptr) debe ser el ultimo (ptr.next().next())
            ptr.setNext(ptr.next().next());
        }
    }
}

public class Prob10 {
    public static void main(String[] args){
        ListP10 list = new ListP10();
        list.addLast(10);
        list.addLast(344);
        list.addLast(80);
        list.addLast(33);
        list.addLast(77);
        list.showElements();
        list.removeSecondLast();
        list.showElements();
    }
}
