/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.eda.guias.repaso;

import edu.ulima.eda.colas.Queue;

/**
 *
 * @author JC
 */
public class Prob01B {
    public static void copyQueue(Queue src, Queue dst){
        while(src.isEmpty() == false){
            dst.enqueue(src.dequeue());
        }
    }
    public static Queue power(Queue s, int n){
        Queue ans = new Queue();
        Queue aux = new Queue();
        copyQueue(s, aux);
        while(aux.isEmpty() == false){
            int element = aux.dequeue();
            int result = (int)Math.pow(element, n);
            s.enqueue(element);
            ans.enqueue(result);            
        }
        return ans;
    }
    
    
    public static void main(String[] args){
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.showElements();
        
        power(q, 3).showElements();
        q.showElements();
    }
}
