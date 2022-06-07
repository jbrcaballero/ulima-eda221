package edu.ulima.eda.guias.guia07;

import edu.ulima.eda.colas.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JC
 */
public class Prob05 {
    public static boolean equals(Queue q1, Queue q2){
        boolean ans = true;
        while(q1.isEmpty() == false && q2.isEmpty() == false){
            int element1 = q1.dequeue();
            int element2 = q2.dequeue();
            if(element1 != element2){
                ans = false;
            }
        }
        if(q1.isEmpty() == false || q2.isEmpty() == false){
            ans = false;
        }        
        return ans;
    }
    
    public static void main(String[] args){
        Queue q1 = new Queue();
        q1.enqueue(21);
        q1.enqueue(34);
        q1.enqueue(3);
        q1.enqueue(34);
        
        Queue q2 = new Queue();
        q2.enqueue(21);
        q2.enqueue(34);
        q2.enqueue(3);
        q2.enqueue(34);
        q2.enqueue(14);
        
        System.out.println(equals(q1, q2));        
    }
}
