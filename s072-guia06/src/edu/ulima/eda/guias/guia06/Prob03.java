/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.guias.guia06;

import static edu.ulima.eda.guias.guia06.Prob01.copyStack;
import edu.ulima.eda.pilas.Stack;

/**
 *
 * @author JC
 */
public class Prob03 {    
    
    public static void reverse(Stack s){
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        //Copiamos elementos de s a s1 (estaran invertidos)
        copyStack(s, s1);
        //Copiamos elementos de s1 a s2 (estaran en el orden original)
        copyStack(s1, s2);
        //Copiamos elementos de s2 a la pila original (elementos estaran invertidos)
        copyStack(s2, s);
    }
    
    public static void main(String[] args){
        Stack s1 = new Stack();
        s1.push(12);
        s1.push(22);
        s1.push(45);
        s1.push(55);
        s1.showElements();
        reverse(s1);
        s1.showElements();
    }
}
