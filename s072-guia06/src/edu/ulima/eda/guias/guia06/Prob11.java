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
public class Prob11 {
        public static Stack merge(Stack s1, Stack s2){
        Stack ans = new Stack();
        Integer element1 = s1.pop();
        Integer element2 = s2.pop();
        while(element1 != null || element2 != null){
            if(element1 == null){
                ans.push(element2);
                element2 = s2.pop();
            }else if(element2 == null){
                ans.push(element1);
                element1 = s1.pop();
            }else if(element1 > element2){
                ans.push(element1);
                element1 = s1.pop();
            }else{
                ans.push(element2);
                element2 = s2.pop();
            }
        }        
        return ans;
    }
    public static void main(String[] args){
        Stack s1 = new Stack();
        s1.push(1);
        s1.push(3);
        s1.push(5);
        s1.push(7);
        s1.showElements();
        
        Stack s2 = new Stack();
        s2.push(2);
        s2.push(4);
        s2.push(6);
        s2.push(8);
        s2.push(10);
        s2.showElements();
        
        Stack ans = merge(s1, s2);
        ans.showElements();
    }
}
