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
public class Prob08 {
    public static boolean equals(Stack s1, Stack s2){
        boolean ans = true;
        //Creamos 2 pilas auxiliares, para almacenar los elementos de cada pila
        Stack aux1 = new Stack();
        Stack aux2 = new Stack();
        
        while(ans == true && s1.isEmpty() == false && s2.isEmpty() == false){
            //Extraemos el elemento de la cima en cada una de las pilas
            int element1 = s1.pop();
            int element2 = s2.pop();
            //Almacenamos los elementos extraidos en las pilas auxiliares
            aux1.push(element1);
            aux2.push(element2);
            //Comparamos los elementos
            if(element1 != element2){
                ans = false;
            }
        }
        //Si alguna pila no esta vacia, no son del mismo tamano
        if(s1.isEmpty() == false || s2.isEmpty() == false){
            ans = false;
        }
        
        //Restaurar valores en las pilas originales
        Prob01.copyStack(aux1, s1);
        Prob01.copyStack(aux2, s2);
        return ans;
    }
    
    public static void main(String[] args){
        Stack s1 = new Stack();
        s1.push(12);
        s1.push(22);
        s1.push(45);
        s1.push(55);
        
        Stack s2 = new Stack();
        s2.push(12);
        s2.push(33);
        s2.push(45);
        s2.push(55);
        
        s1.showElements();
        s2.showElements();
        
        System.out.println(equals(s1, s2));
        System.out.println(equals(s2, s1));
        s1.showElements();
        s2.showElements();
           
    }
}
