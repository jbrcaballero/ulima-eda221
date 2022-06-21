/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.evaluaciones.ee03;

import edu.ulima.eda.pilas.Stack;

/**
 *
 * @author JC
 */
public class Prob01 {
    public static Stack extractElements(Stack P, int minValue, int maxValue){
        Stack ans = new Stack();
        while(P.isEmpty() == false){
            int element = P.pop();
            if(element > minValue && element <= maxValue){
                ans.push(element);
            }
        }
        return ans;
    }
    
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(12);
        s.push(12);
        s.push(18);
        s.push(25);
        s.push(3);
        s.showElements();
        Stack s1 = extractElements(s, 12, 40);
        s1.showElements();
    }
}
