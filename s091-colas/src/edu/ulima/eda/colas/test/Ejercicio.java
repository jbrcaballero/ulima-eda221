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
public class Ejercicio {
    /*
        Implemente un algoritmo que, dadas 2 colas Q1 y Q2 que almacenan numeros
        positivos, obtenga una cola de respuesta Q3 tomando en cuenta los elementos 
        de Q1 y Q2 de 3 cifras
    */
    
    public static Queue specialMerge(Queue q1, Queue q2){
        Queue q3 = new Queue();
        while(q1.isEmpty() == false){
            int element = q1.dequeue();
            if(element >= 100 && element < 1000){
                q3.enqueue(element);
            }
        }
        //Mejora: Implementar un metodo para evitar codigo repetido
        while(q2.isEmpty() == false){
            int element = q2.dequeue();
            if(element >= 100 && element < 1000){
                q3.enqueue(element);
            }
        }        
        return q3;
    }
    
    
    public static void main(String[] args){
        Queue q1 = new Queue();
        q1.enqueue(110);
        q1.enqueue(22);
        q1.enqueue(550);
        q1.enqueue(66);        
        q1.showElements();

        Queue q2 = new Queue();
        q2.enqueue(33);
        q2.enqueue(56);
        q2.enqueue(100);
        q2.enqueue(190);                
        q2.showElements();
        
        Queue q3 = specialMerge(q1, q2);
        q3.showElements();
    }
    
}
