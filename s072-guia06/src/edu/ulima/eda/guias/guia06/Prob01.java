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
public class Prob01 {
    
    public static int countElements(Stack P){
        Stack aux = new Stack();
        int count = 0;
        while(P.isEmpty() == false){
            //Elimina el elemento que esta en la cima de la pila
            int value = P.pop();
            //Agregamos el elemento eliminado a la pila auxiliar
            aux.push(value);
            //Considera el elemento eliminado en el conteo
            count = count + 1;
        }
        copyStack(aux, P);

        return count;
    }
    //Metodo auxiliar que copia todos los elementos de la pila origen a la pila destino
    public static void copyStack(Stack src, Stack dst){
        while(src.isEmpty() == false){
            //Agrego el elemento de la pila origen a la pila de destino
            dst.push(src.pop());
        }
    }
    
    public static void main(String[] args){
        //Crear la pila
        Stack P = new Stack();
        
        //Agregar elementos
        P.push(10);
        P.push(20);
        P.push(30);
        P.push(40);
                
        //Mostrar los elementos (antes de contar)
        P.showElements();
        
        //Mostrar la cantidad elementos
        int count = countElements(P);
        System.out.println("Cantidad de elementos: " + count);
        
        //Mostrar los elementos (despues de contar)
        P.showElements();
    }
}
