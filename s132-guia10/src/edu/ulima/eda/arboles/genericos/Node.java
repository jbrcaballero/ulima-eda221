/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.arboles.genericos;

/**
 *
 * @author JC
 */
public class Node<T>{
    private T value;
    private Node left;
    private Node right;
    
    public Node(T value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
    
    public T value(){
        return value;
    }
    
    public Node left(){
        return left;
    }
    
    public Node right(){
        return right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
        
}
