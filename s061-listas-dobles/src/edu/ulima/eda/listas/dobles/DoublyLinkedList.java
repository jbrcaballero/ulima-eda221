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
public class DoublyLinkedList {
    private Node I;
    private Node F;

    public DoublyLinkedList(){
        this.I = null;
        this.F = null;
    }

    public Node getI() {
        return I;
    }

    public Node getF() {
        return F;
    }
        
    public void addFirst(Integer value){
        Node newNode = new Node(value);
        newNode.setNext(I);        
        if(I == null){            
            F = newNode;
        }else{
            I.setPrev(newNode);
        }
        I = newNode;
    }
    
    public void addLast(Integer value){                       
        if(I == null){
            addFirst(value);
        }else{
            Node newNode = new Node(value);
            F.setNext(newNode);
            newNode.setPrev(F);
            F = newNode;
        }        
    }
    
    public void remove(Integer ref){
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
