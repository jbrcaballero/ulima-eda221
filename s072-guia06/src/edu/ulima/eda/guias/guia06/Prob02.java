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
public class Prob02 {
    public static boolean find(Stack P, int X){
        Stack aux = new Stack();
        boolean ans = false;
        while(P.isEmpty() == false){
            int value = P.pop();
            aux.push(value);
            if(value == X){
                ans = true;
                break;
            }
        }
        copyStack(aux, P);
        return ans;
    }
    
    public static void main(String[] args){
        //Crear pila
        Stack P = new Stack();
        P.push(10);
        P.push(20);
        P.push(30);
        P.push(40);
                
        //Mostrar los elementos (antes de buscar)
        P.showElements();
        
        //Resultado de buscar el elemento X = 20
        System.out.println(find(P, 50));
        
        //Mostrar los elementos (despues de buscar)
        P.showElements();
    }
}
