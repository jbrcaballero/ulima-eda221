/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.pilas.genericas;

import edu.ulima.eda.listas.genericas.LinkedList;

/**
 *
 * @author JC
 */
public class Stack<T> {
    private LinkedList<T> data;
    
    public Stack(){
        data = new LinkedList<>();
    }
    
    public void push(T element){
        data.addFirst(element);
    }
    
    public T pop(){
        T element = null;
        if(this.isEmpty() == false){
            element = data.getL().value();
            data.removeFirst();
        }
        return element;        
    }
    
    public boolean isEmpty(){
        if(data.getL() == null){
            return true;
        }else{
            return false;
        }
    }
    
    public void showElements(){
        System.out.print("cima -> ");
        data.showElements();
    }
}
