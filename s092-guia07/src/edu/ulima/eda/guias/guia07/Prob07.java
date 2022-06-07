/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.guias.guia07;

import edu.ulima.eda.colas.Queue;

/**
 *
 * @author JC
 */
public class Prob07 {
    
    public static Queue merge(Queue q1, Queue q2){
        Queue ans = new Queue();
        Integer element1 = q1.dequeue();
        Integer element2 = q2.dequeue();
        while(element1 != null || element2 != null){
            if(element1 == null){
                ans.enqueue(element2);
                element2 = q2.dequeue();
            }else if(element2 == null){
                ans.enqueue(element1);
                element1 = q1.dequeue();
            }else if(element1 < element2){
                ans.enqueue(element1);
                element1 = q1.dequeue();
            }else{
                ans.enqueue(element2);
                element2 = q2.dequeue();
            }
        }        
        return ans;
    }
    
    public static void main(String[] args){
        Queue q1 = new Queue();
        q1.enqueue(1);
        q1.enqueue(3);
        q1.enqueue(5);
        q1.enqueue(7);
        
        Queue q2 = new Queue();
        q2.enqueue(2);
        q2.enqueue(4);
        q2.enqueue(6);
        q2.enqueue(8);
        q2.enqueue(10);
        q2.enqueue(12);
        
        Queue c = merge(q1, q2);
        c.showElements();
    }
}























