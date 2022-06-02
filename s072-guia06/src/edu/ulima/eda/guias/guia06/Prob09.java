/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.guias.guia06;

import edu.ulima.eda.listas.LinkedList;
import edu.ulima.eda.pilas.Stack;

/**
 *
 * @author JC
 */

//Cambio: Debe copiarse el contenido de P a una lista enlazada (repaso)

public class Prob09 {
    public static LinkedList copy(Stack s){
        LinkedList ans = new LinkedList();
        Stack aux = new Stack();
        while(s.isEmpty() == false){
            int element = s.pop();
            ans.addLast(element);
            aux.push(element);
        }
        Prob01.copyStack(aux, s);
        return ans;
    }
        
    public static void main(String[] args){
        Stack s1 = new Stack();
        s1.push(12);
        s1.push(22);
        s1.push(45);
        s1.push(55);
        s1.showElements();
        LinkedList ans = copy(s1);
        ans.showElements();
        s1.showElements();
    }
}
