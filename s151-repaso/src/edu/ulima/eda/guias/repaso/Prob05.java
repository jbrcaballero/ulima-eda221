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
public class Prob05 {
    
    public static int countNodes(Node A){
        if(A == null){
            return 0;
        }else{
            int ans = 0;
            if(A.right() == null){
                ans = ans + 1;
            }
            return ans + countNodes(A.left()) + countNodes(A.right());
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
        
        System.out.println(countNodes(root));
        
    }    
}
