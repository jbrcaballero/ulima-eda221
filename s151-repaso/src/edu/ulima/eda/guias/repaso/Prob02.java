/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.eda.guias.repaso;

import edu.ulima.eda.colas.Queue;

/**
 *
 * @author JC
 */
public class Prob02 {
    
    public static int count(Queue q){
        int count = 0;
        while(q.isEmpty() == false){
            q.dequeue();
            count = count + 1;
        }
        return count;
    }
    
    public static int countNotAttented(Queue q1, Queue q2, int n){
        int notAttended = count(q1) + count(q2) - n;
        if(notAttended > 0){
            return notAttended;
        }else{
            return 0;
        }
    }
            
    public static void main(String[] args){
        Queue q1 = new Queue();
        Queue q2 = new Queue();
        
        q1.enqueue(18);
        q1.enqueue(22);
        q1.enqueue(20);
        q1.enqueue(50);
        
        q2.enqueue(70);
        q2.enqueue(85);
        
        System.out.println(countNotAttented(q1, q2, 3));
        
    }
}
