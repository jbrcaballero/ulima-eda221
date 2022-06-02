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
public class Prob05 {
    public static void addBottom(Stack s1, int x){
        Stack aux1 = new Stack();
        Prob01.copyStack(s1, aux1);
        aux1.push(x);
        Prob01.copyStack(aux1, s1);
    }
    
    public static void addBottom2(Stack s1, int x){
        Stack aux1 = new Stack();
        //Copiar elementos a la pila auxiliar
        while(s1.isEmpty() == false){
            aux1.push(s1.pop());
        }
        //El primer elemento por apilar debe ser "x"
        aux1.push(x);
        //Apilar los elementos restantes en la pila original
        while(aux1.isEmpty() == false){
            s1.push(aux1.pop());
        }
    }
    
    public static void main(String[] args){
        Stack s1 = new Stack();
        s1.push(12);
        s1.push(22);
        s1.push(45);
        s1.push(55);
        s1.showElements();
        addBottom(s1, 19);
        s1.showElements();
        addBottom2(s1, 60);
        s1.showElements();
        
    }
}
