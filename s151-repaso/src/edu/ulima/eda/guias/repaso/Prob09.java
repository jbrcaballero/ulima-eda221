/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.eda.guias.repaso;

import edu.ulima.eda.arboles.Node;
import edu.ulima.eda.arboles.abb.BinarySearchTree;

/**
 *
 * @author JC
 */
public class Prob09 {
    
    public static int getRightNode(Node root){
        Node ptr = root;
        while(ptr.right() != null){
            ptr = ptr.right();
        }
        return ptr.value();
    }
    
    public static void showHighestGrade(Node A1, Node A2){
        int highestGrade = getRightNode(A2);
        int studentCode = getRightNode(A1);
        System.out.println("Maxima calificación: ");
        System.out.println("Cod. Alumno: " + studentCode);
        System.out.println("Nota: " + highestGrade);
    }
    
    public static void main(String[] args){
        /*
                   789
                  /   \
                901   738
                         \
                         655
        
        */ 
        
        Node A2 = new Node(789);
        
        Node node2 = new Node(901);
        Node node3 = new Node(738);
        
        A2.setLeft(node2);
        A2.setRight(node3);
        
        Node node4 = new Node(655);
        node3.setRight(node4);
        
        Node A1 = BinarySearchTree.insert(null, 12);
        BinarySearchTree.insert(A1, 6);
        BinarySearchTree.insert(A1, 20);
        BinarySearchTree.insert(A1, 80);
        
        showHighestGrade(A1, A2);
    }
}
