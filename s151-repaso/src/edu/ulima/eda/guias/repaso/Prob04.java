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
public class Prob04 {
    
    public static int countDigits(int n){
        int count = 0;
        while(n > 0){
            count = count + 1;
            n = n / 10;
        }
        return count;
    }
    //Precondicion: Por lo menos un elemento de "n" cifras
    public static int getProduct(Node A, int n){
        int ans = 1;
        if(A != null){
            if(countDigits(A.value()) == n){
                ans = A.value();
            }
            ans = ans * getProduct(A.left(), n) * getProduct(A.right(), n);
        }
        return ans;
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
        
        System.out.println(getProduct(root, 2));
    }    
}
