/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.eda.guias.repaso;

import edu.ulima.eda.pilas.Stack;

/**
 *
 * @author JC
 */
public class Prob01A {
    public static void copyStack(Stack src, Stack dst){
        while(src.isEmpty() == false){
            dst.push(src.pop());
        }
    }
    public static Stack power(Stack s, int n){
        Stack ans = new Stack();
        Stack aux = new Stack();
        copyStack(s, aux);
        while(aux.isEmpty() == false){
            int element = aux.pop();
            int result = (int)Math.pow(element, n);
            s.push(element);
            ans.push(result);            
        }
        return ans;
    }
    
    
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.showElements();
        
        power(s, 3).showElements();
        s.showElements();
    }
}
