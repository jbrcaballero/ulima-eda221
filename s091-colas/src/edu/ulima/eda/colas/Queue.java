/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.colas;

/**
 *
 * @author JC
 */
public class Queue {
    protected int[] C;
    protected int front;
    protected int rear;
    protected static final int MAX_SIZE = 50;
    
    public Queue(){
        C = new int[MAX_SIZE];
        front = -1;
        rear = -1;
    }
    
    public boolean isEmpty(){
        boolean state = false;
        if(front == -1 && rear == -1){
            state = true;
        }
        return state;
    }
    
    public boolean isFull(){
        boolean state = false;
        if((front == 0 && rear == MAX_SIZE - 1) || front == rear + 1){
            state = true;
        }
        return state;
    }
    
    public void enqueue(Integer item){
        if(!this.isFull()){
            if(this.isEmpty()){
                front = 0;
                rear = 0;
            }else if(rear == MAX_SIZE - 1){
                rear = 0;
            }else{
                rear++;
            }
            C[rear] = item;
        }
    }
    
    public Integer dequeue(){
        Integer element = null;
        if(front != -1 && rear != -1){
            element = C[front];
            if(front == rear){
                front = -1;
                rear = -1;
            }else{
                if(front == MAX_SIZE - 1){
                    front = 0;
                }else{
                    front++;
                }
            }
        }
        return element;
    }
    
    public void showElements(){
        System.out.print("frente -> ");
        if(!this.isEmpty()){
            if(front <= rear){
                for(int i = front; i <= rear; i++){
                    System.out.print(C[i] + " -> ");
                }
            }else{
                for(int i = front; i < C.length; i++){
                    System.out.print(C[i] + " -> ");
                }
                for(int i = 0; i < front; i++){
                    System.out.print(C[i] + " -> ");
                }
            }        
        }
        System.out.println("final");
    }    
}
