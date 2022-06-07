/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.guias.guia07;

import edu.ulima.eda.colas.Queue;

/**
 *
 * @author JC
 */

public class Prob04 {
    public static void replace(Queue q, int oldValue, int newValue){
        Queue aux = new Queue();
        //Copiar los elemenots a una cola auxiliar
        Prob02.copy(q, aux);
        //Recorrer la cola auxiliar
        while(aux.isEmpty() == false){
            //Desencolar cada elemento
            int element = aux.dequeue();
            //Si el elemento coincide con el valor buscado
            if(element == oldValue){
                //Reemplazar con el nuevo valor
                element = newValue;
            }
            q.enqueue(element);
        }
    
    }
    
    public static void main(String[] args){
        Queue q1 = new Queue();
        q1.enqueue(12);
        q1.enqueue(-50);
        q1.enqueue(21);
        q1.enqueue(10);        
        q1.enqueue(12);
        q1.showElements();
        replace(q1, 12, 100);
        q1.showElements();
               
    }
}
