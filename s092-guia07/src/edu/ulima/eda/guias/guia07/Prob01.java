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

class QueueP01 extends Queue{
    public int count(){
        if(this.front <= this.rear){
            return this.rear - this.front + 1;
        }else{
            return MAX_SIZE - this.front + this.rear + 1;
        }
    }
}

public class Prob01 {
    public static int countElements(Queue q){
        int count = 0;
        while(q.isEmpty() == false){
            count++;
            q.dequeue();
        }
        return count;
    }
    
    public static void main(String[] args) {
        QueueP01 q = new QueueP01();
        q.enqueue(12);
        q.enqueue(25);
        q.enqueue(36);
        q.enqueue(98);
        q.showElements();
        System.out.println("Cantidad de elementos: " + countElements(q));
    }
}
