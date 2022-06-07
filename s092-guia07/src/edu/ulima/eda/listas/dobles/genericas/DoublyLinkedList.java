/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.listas.dobles.genericas;

/**
 *
 * @author JC
 */
public class DoublyLinkedList<T>{
    private Node<T> I;
    private Node<T> F;
    
    public Node<T> getI() {
        return I;
    }
    
    public Node<T> getF() {
        return F;
    }
    
    public DoublyLinkedList(){
        this.I = null;
        this.F = null;
    }
    
    public void addFirst(T value){
        Node newNode = new Node(value);
        newNode.setNext(I);        
        if(I == null){            
            F = newNode;
        }else{
            I.setPrev(newNode);
        }
        I = newNode;
    }
    
    public void addLast(T value){                       
        if(I == null){
            addFirst(value);
        }else{
            Node newNode = new Node(value);
            F.setNext(newNode);
            newNode.setPrev(F);
            F = newNode;
        }        
    }
    
    public void remove(T ref){
        Node ptr = I;
        boolean found = false;
        while(ptr != null && found == false){
            if(ptr.value().equals(ref)){
                found = true;
            }else{
                ptr = ptr.next();
            }
        }
        if(ptr != null){
            if(ptr.prev() == null){
                I = ptr.next();
                I.setNext(null);
            }else if(ptr.next() != null){
                ptr.prev().setNext(ptr.next());
                ptr.next().setPrev(ptr.prev());
            }else{
                ptr.prev().setNext(null);
            }            
        }
    }
    
    public void removeFirst(){
	if(I!= null){
            I = I.next();
	}
    }
    
    public void show(){
        Node ptr = I;
        while(ptr != null){
            System.out.print(ptr.value() + " -> ");
            ptr = ptr.next();
        }
        System.out.println("null");
    }
    
    public void showReverse(){
        Node ptr = F;
        while(ptr != null){
            System.out.print(ptr.value() + " -> ");
            ptr = ptr.prev();
        }
        System.out.println("null");
    }
    
}
