/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.colas.genericas;
import edu.ulima.eda.listas.dobles.genericas.DoublyLinkedList;
import edu.ulima.eda.listas.dobles.genericas.Node;

/**
 *
 * @author JC
 */
public class Queue<T>{
    private DoublyLinkedList<T> elements;
 
    public Queue(){
        elements = new DoublyLinkedList<>();
    }
    
    public void enqueue(T item){
        elements.addLast(item);
    }
    
    public T dequeue(){
        T ans = null;
        if(elements.getI() != null){
            ans = elements.getI().value();
            elements.removeFirst();
        }
        return ans;        
    }
    
    public boolean isEmpty(){
        if(elements.getI() == null){
            return true;
        }else{
            return false;
        }
    }
    
    public void showElements(){
        Node<T> ptr = elements.getI();
        System.out.print("frente -> ");
        while(ptr != null){
            System.out.print(ptr.value() + " -> ");
            ptr = ptr.next();
            
        }
        System.out.println("final");
    }
}
