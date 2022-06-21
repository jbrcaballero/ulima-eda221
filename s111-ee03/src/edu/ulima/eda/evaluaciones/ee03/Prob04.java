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
class StackP04 extends Stack{
    public Queue popQueue(int t){
        Queue ans = new Queue();
        Stack aux = new Stack();
        int count = 0;
        //Llevamos a una cola auxiliar y contamos elementos
        while(this.isEmpty() == false){
            aux.push(this.pop());
            count = count + 1;
        }
        //Si no hay elementos suficientes, mostramos un mensaje
        if(count < t){
            System.out.println("Elementos insuficientes. Se extrajeron: " + count);
            t = count;
        }
        
        //Llenamos la cola de respuesta
        for(int i = 0; i < t; i++){
            ans.enqueue(aux.pop());
        }
        
        //Regresamos a la cola original los elementos restantes
        while(aux.isEmpty() == false){
            this.push(aux.pop());
        }        
        return ans;
        //Complejidad: O(n) - tamano de la pila (solo realiza recorridos).
    }
}
public class Prob04 {    
    public static void main(String[] args){
        StackP04 s1 = new StackP04();
        s1.push(14);
        s1.push(29);
        s1.push(10);
        s1.push(8);
        System.out.println("Pila Antes:");
        s1.showElements();
        
        Queue q1 = s1.popQueue(3);
        System.out.println("Cola con elementos extraidos:");
        q1.showElements();
        
        System.out.println("Pila despues:");
        s1.showElements();                
    }
}
