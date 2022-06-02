/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.listas.genericas;

/**
 *
 * @author JC
 */
public class Node<T> {
    private T value;
    private Node next;
  
    public Node(T value){
        this.value = value;
        this.next = null;
    }
    
    public T value(){
        return value;
    }

    public Node next(){
        return next;
    }
    
    public void setNext(Node next){
        this.next = next;
    }    
}
