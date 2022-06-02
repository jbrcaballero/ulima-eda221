/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.pilas;

/**
 *
 * @author JC
 */
public class Stack {
    private Integer[] data;
    protected int top;
    private static int MAX_SIZE = 50;
    
    public Stack(){
        data = new Integer[MAX_SIZE];
        top = -1;
    }
    
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }
    
    private boolean isFull(){
        if(top + 1 == MAX_SIZE){
            return true;
        }else{
            return false;
        }    
    }
    
    public void push(Integer item){
        if(this.isFull() == false){
            top = top + 1;
            data[top] = item;
        }
    }
    
    public Integer pop(){
        Integer value = null;
        if(this.isEmpty() == false){
            value = data[top];
            top = top - 1;
        }
        return value;
    }
    
    public void showElements(){
        System.out.print("cima");
        for(int i = top; i >= 0; i--){
            System.out.print(" <-- " + data[i]);
        }
        System.out.println();
    }
    
}
