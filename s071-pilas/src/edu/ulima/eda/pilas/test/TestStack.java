/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.pilas.test;

import edu.ulima.eda.pilas.Stack;

/**
 *
 * @author JC
 */
public class TestStack {
    
    public static int countOcurrences(Stack s, int x){
        int count = 0;
        while(s.isEmpty() == false){
            int value = s.pop();
            if(value == x){
                count = count + 1;
            }
        }
        return count;
    }
    
    
    public static void main(String[] args){
        Stack s1 = new Stack();
        s1.push(12);
        s1.push(22);
        s1.push(30);
        s1.push(12);
        s1.push(55);
        s1.showElements();
        
        int x = s1.pop();
        System.out.println("Elemento: " + x);
        s1.showElements();
        
        int ans = countOcurrences(s1, 12);
        System.out.println("Cant. apariciones: " + ans);
    }
}
