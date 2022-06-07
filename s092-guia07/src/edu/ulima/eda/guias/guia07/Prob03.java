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
public class Prob03 {
    public static void addFront(Queue q, int element){
        Queue aux = new Queue();
        //Copiar elementos a cola auxiliar
        Prob02.copy(q, aux);
        //Agregar el elemento que debe ir al frente
        q.enqueue(element);
        //Regresar los elementos de la cola auxiliar a la original
        Prob02.copy(aux, q);
    }
    
    public static void main(String[] args){
        Queue q = new Queue();
        q.enqueue(12);
        q.enqueue(22);
        q.enqueue(10);
        q.enqueue(55);
        q.showElements();
        addFront(q, 30);    
        q.showElements();
    }
    
    
    
}
