/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.eda.guias.repaso;

import edu.ulima.eda.arboles.Node;

/**
 *
 * @author JC
 */
public class Prob07 {
    
    public static boolean isComplete(Node A){
        if(A == null){
            return true;
        }else if((A.left() == null && A.right() != null) || 
                (A.left() != null && A.right() == null)){
            return false;
        }else{
            return isComplete(A.left()) && isComplete(A.right());
        }
    }
    
    
    public static void main(String[] args){
        /*
                    9
                  /   \
                 14    28
                /  \   / \
               20  11 4  12
        
        */ 
        
        Node root = new Node(9);
        
        Node node2 = new Node(14);
        Node node3 = new Node(28);
        
        root.setLeft(node2);
        root.setRight(node3);
        
        Node node4 = new Node(20);
        Node node5 = new Node(11);
        
        node2.setLeft(node4);
        node2.setRight(node5);
        
        Node node6 = new Node(12);        
        Node node7 = new Node(4);
        
        node3.setRight(node6);                        
        node3.setLeft(node7);
                
        System.out.println(isComplete(root));        
    }        
}
