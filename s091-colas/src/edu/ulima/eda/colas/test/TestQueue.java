/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.colas.test;

import edu.ulima.eda.colas.Queue;

/**
 *
 * @author JC
 */
public class TestQueue {
    public static void main(String[] args){
        Queue q1 = new Queue();
        q1.enqueue(10);
        q1.enqueue(22);
        q1.enqueue(50);
        q1.enqueue(66);
        
        q1.showElements();
        
        while(q1.isEmpty() == false){
            System.out.println("Elemento: " + q1.dequeue());
        }
        q1.showElements();
    }
}
