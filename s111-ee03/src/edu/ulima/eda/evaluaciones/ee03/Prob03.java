/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.evaluaciones.ee03;

import edu.ulima.eda.colas.Queue;
import edu.ulima.eda.pilas.Stack;

/**
 *
 * @author JC
 */
public class Prob03 {
    public static Queue[] splitElements(Stack P, int X){
        Queue Q1 = new Queue();
        Queue Q2 = new Queue();
        while(P.isEmpty() == false){
            int element = P.pop();
            if(element > X){
                Q1.enqueue(element);
            }else{
                Q2.enqueue(element);
            }
        }
        Queue[] ans = {Q1, Q2};
        return ans;
    }
    
    public static void main(String[] args){
        Stack P = new Stack();
        P.push(8);
        P.push(4);
        P.push(2);        
        int X = 3;
        P.showElements();
        Queue[] ans = splitElements(P, X);
        ans[0].showElements();
        ans[1].showElements();
        
    }
}
