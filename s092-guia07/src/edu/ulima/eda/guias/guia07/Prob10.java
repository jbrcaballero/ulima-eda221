/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.guias.guia07;

import edu.ulima.eda.colas.genericas.Queue;

/**
 *
 * @author JC
 */
public class Prob10 {
    public static void removeAircraft(Queue<String> q, String ref){
        Queue<String> aux = new Queue<>();
        while(q.isEmpty() == false){
            String element = q.dequeue();
            if(element.equals(ref) == false){
                aux.enqueue(element);
            }
        }
        while(aux.isEmpty() == false){
            q.enqueue(aux.dequeue());
        }
        
    }
    
    public static void main(String[] args) {
        Queue<String> q = new Queue<>();
        q.enqueue("UYX-123");
        q.enqueue("HY2-903");
        q.enqueue("ZWB-747");
        q.enqueue("VB6-980");
        q.enqueue("BV3-341");
        q.showElements();
        removeAircraft(q, "BV3-341");
        q.showElements();
    }
}
