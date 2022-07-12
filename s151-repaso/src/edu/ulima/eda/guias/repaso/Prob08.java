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


public class Prob08 {
    
    public static Node findNode(Node A, int m){
        if(A == null){
            return null;
        }else if(A.value() == m){
            return A;
        }else{
            Node ans = findNode(A.left(), m);
            if(ans != null){
                return ans;                
            }else{
                return findNode(A.right(), m);
            }
        }
    }
    
    public static int insertRight(Node A, int m, int n){
        Node refNode = findNode(A, m);
        if(refNode == null){
            return 3;
        }else if(refNode.right() != null){
            return 2;
        }else{
            refNode.setRight(new Node(n));
            return 1;
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
                
        System.out.println(insertRight(root, 100, 20));
    }            
}
