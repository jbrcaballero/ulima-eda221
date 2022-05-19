/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.listas.dobles;

/**
 *
 * @author JC
 */
public class Node {
    private Integer value;
    private Node prev;
    private Node next;
    
    public Node(int value){
        this.value = value;
        this.prev = null;
        this.next = null;
    }
    
    public Integer value(){
        return this.value;
    }
    
    public Node prev(){
        return this.prev;
    }
    
    public Node next(){
        return this.next;
    }
    
    public void setPrev(Node prev){
        this.prev = prev;
    }
    
    public void setNext(Node next){
        this.next = next;
    }
}
