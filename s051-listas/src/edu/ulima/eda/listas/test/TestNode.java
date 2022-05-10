/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.listas.test;

import edu.ulima.eda.listas.Node;

/**
 *
 * @author JC
 */
public class TestNode {
    public static void main(String[] args){
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(45);
        Node n4 = new Node(1);
        
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        // n1 -> n2 -> n3 -> null
        
        Node ptr = n1;
        while(ptr != null){
            int value = ptr.value();
            System.out.println(value);
            ptr = ptr.next();            
        }
        
    }
    
}
