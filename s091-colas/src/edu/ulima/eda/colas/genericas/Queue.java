/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.colas.genericas;

import edu.ulima.eda.listas.dobles.genericas.DoublyLinkedList;

/**
 *
 * @author JC
 */
public class Queue<T> {
    private DoublyLinkedList<T> data;
    
    public Queue(){
        data = new DoublyLinkedList<>();
    }
    
    public void enqueue(T element){
        data.addLast(element);
    }
    
    public T dequeue(){
        T value = null;
        if(this.isEmpty() == false){
            value = data.getI().value();
            data.removeFirst();
        }
        return value;
    }
    
    public boolean isEmpty(){
        if(data.getI() == null){
            return true;
        }else{
            return false;
        }
    }
    
    public void showElements(){
        System.out.print("frente -> ");
        data.show();
    }
}
