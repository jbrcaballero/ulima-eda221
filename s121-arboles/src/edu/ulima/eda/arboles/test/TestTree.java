/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.arboles.test;

import edu.ulima.eda.arboles.Node;

/**
 *
 * @author JC
 */
public class TestTree {
    
    public static int count(Node root){
        //Arbol vacio
        if(root == null){
            return 0;
        }else{
            return 1 + count(root.left()) + count(root.right());
        }
    }
    
    
    public static void main(String[] args){
        /*
                    9
                  /   \
                 14   28
                /  \    \
               20  11    12        
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
        node3.setRight(node6);
        
        System.out.println(count(root));
    }
}
