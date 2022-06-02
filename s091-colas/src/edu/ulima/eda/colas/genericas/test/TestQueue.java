/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.colas.genericas.test;

import edu.ulima.eda.colas.genericas.Queue;

/**
 *
 * @author JC
 */
public class TestQueue {
    public static void main(String[] args) {
        Queue<String> q1 = new Queue<>();
        q1.enqueue("ABC");
        q1.enqueue("DEF");
        q1.enqueue("GHI");
        q1.enqueue("JKL");
        System.out.println(q1.dequeue());      
        q1.showElements();
                
    }
}
