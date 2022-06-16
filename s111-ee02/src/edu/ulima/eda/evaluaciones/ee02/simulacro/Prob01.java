/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.evaluaciones.ee02.simulacro;

import edu.ulima.eda.pilas.Stack;

/**
 *
 * @author JC
 */

//Implemente un programa que reciba una pila y retorne la cantidad de elementos pares
public class Prob01 {
    
    public static int countEven(Stack s){
        int count = 0;
        while(s.isEmpty() == false){
            int element = s.pop();
            if(element % 2 == 0){
                count = count + 1;
            }
        }
        return count;
    }
    
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(12);
        s.push(15);
        s.push(22);
        s.push(40);
        int count = countEven(s);
        System.out.println("Cantidad de pares: " + count);
        
    }
    
}
