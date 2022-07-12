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
public class Prob06 {
    public static int sumDigits(int n){
        int sum = 0;
        while(n > 0){
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }
    
    public static int getMaxDigitSum(Node A){
        if(A == null){
            return 0;
        }else{
            return Math.max(sumDigits(A.value()), Math.max(getMaxDigitSum(A.left()),
                    getMaxDigitSum(A.right())));
        }
    }
    
    public static void main(String[] args){
        /*
                    12
                  /   \
                 16   20
        
        */ 
        
        Node root = new Node(12);
        
        Node node2 = new Node(16);
        Node node3 = new Node(20);
        
        root.setLeft(node2);
        root.setRight(node3);
        
        System.out.println(getMaxDigitSum(root));
    }    
}
