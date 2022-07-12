/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.guias.guia09;

import edu.ulima.eda.arboles.Node;
import edu.ulima.eda.colas.genericas.Queue;

/**
 *
 * @author JC
 */
public class Prob09 {
    public static int getLeafCount(Node root){
        Queue<Node> nodes = new Queue<>();
        int count = 0;
        nodes.enqueue(root);
        while(nodes.isEmpty() == false){
            Node currNode = nodes.dequeue();
            if(currNode.left() == null && currNode.right() == null){
                 count = count + 1;
            }
            if(currNode.left() != null){
                nodes.enqueue(currNode.left());
            }
            if(currNode.right() != null){
                nodes.enqueue(currNode.right());
            }            
        }
        return count;
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
        
    }
}

