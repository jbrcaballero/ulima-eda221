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
public class Prob02 {
    
    public static void copy(Queue src, Queue dest){
        while(src.isEmpty() == false){
            dest.enqueue(src.dequeue());
        }
    }
    
    public static boolean allPositive(Queue q){        
        boolean state = true;
        Queue aux = new Queue();
        while(q.isEmpty() == false){
            int element = q.dequeue();
            if(element < 0){
                state = false;
            }
            aux.enqueue(element);     
        }
        copy(aux, q);                
        return state;
    }
    
    public static void main(String[] args){
        Queue q1 = new Queue();
        q1.enqueue(12);
        q1.enqueue(-50);
        q1.enqueue(21);
        q1.enqueue(10);        
        q1.showElements();
        System.out.println(allPositive(q1));
        q1.showElements();        
    }
}
