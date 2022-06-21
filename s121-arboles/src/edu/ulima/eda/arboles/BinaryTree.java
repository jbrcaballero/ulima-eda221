/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.arboles;

/**
 *
 * @author JC
 */
public class BinaryTree {
    public static void printPreorder(Node root){
        if(root != null){
            System.out.print(root.value() + "  ");
            printPreorder(root.left());
            printPreorder(root.right());
        }        
    }
    
    public static void printInorder(Node root){
        if(root != null){
            printInorder(root.left());
            System.out.print(root.value() + "  ");            
            printInorder(root.right());
        }        
    }
    
    public static void printPostorder(Node root){
        if(root != null){
            printPostorder(root.left());
            printPostorder(root.right());
            System.out.print(root.value() + "  ");
        }        
    }
}
