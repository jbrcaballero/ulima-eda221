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
public class Prob03 {
    public static int getTotalPoints(Stack s){
        int total = 0;
        int element = 0;
        while(s.isEmpty() == false){
            element = s.pop();
            total = total + element;
        }
        return total - element;
    }
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(3000);
        s.push(180);
        s.push(400);
        s.push(120);
        
        System.out.println(getTotalPoints(s));
    }
}
