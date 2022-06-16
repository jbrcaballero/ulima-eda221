/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.evaluaciones.ee02.simulacro;

import edu.ulima.eda.colas.Queue;

/**
 *
 * @author JC
 */
//Implemente un programa que reciba una cola y retorne la cantidad de elementos pares
public class Prob03 {
    
    public static int countEven(Queue q){
        int count = 0;
        while(q.isEmpty() == false){
            int element = q.dequeue();
            if(element % 2 == 0){
                count = count + 1;
            }
        }
        return count;
    }
    
    public static void main(String[] args){
        Queue q = new Queue();
        q.enqueue(21);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.showElements();
        System.out.println("Cantidad de elementos: " + countEven(q));
    }
}
