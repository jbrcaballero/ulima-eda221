/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.guias.guia06;

import edu.ulima.eda.pilas.Stack;

/**
 *
 * @author JC
 */
public class Prob06 {
    
    public static boolean allPositive(Stack s1){
        boolean ans = true;
        Stack aux = new Stack();
        while(s1.isEmpty() == false){
            int element = s1.pop();
            if(element < 0){
                ans = false;
            }
            aux.push(element);
        }
        Prob01.copyStack(aux, s1);
        return ans;
    }
    
    public static void main(String[] args){
        Stack s1 = new Stack();
        s1.push(-12);
        s1.push(22);
        s1.push(45);
        s1.push(55);
        s1.showElements();
        System.out.println(allPositive(s1));
        s1.showElements();
        
    }
}
