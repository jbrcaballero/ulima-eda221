/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.evaluaciones.ee03;

import edu.ulima.eda.colas.Queue;

/**
 *
 * @author JC
 */
public class Prob02 {
    
    public static void showGameResult(Queue Q, int n){
        Integer minDifference = null;
        Integer minDifferenceValue = null;
        while(Q.isEmpty() == false){
            int element = Q.dequeue();
            int difference = Math.abs(element - n);
            if(minDifference == null || difference < minDifference){
                minDifference = difference;
                minDifferenceValue = element;
            }
        }
        if(minDifference == 0){
            System.out.println("Felicidades: Ha adividado numero");
        }else{
            System.out.println("Lo sentimos. No ha adiviando. Valor mas cercano: " + minDifferenceValue);
        }
    }
    
    public static void main(String[] args){
        Queue Q = new Queue();
        Q.enqueue(1);
        Q.enqueue(5);
        Q.enqueue(19);
        Q.enqueue(11);
        showGameResult(Q, 4);
    }
}
