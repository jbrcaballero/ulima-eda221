/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.guias.guia10;

import edu.ulima.eda.arboles.Node;
import edu.ulima.eda.arboles.abb.BinarySearchTree;
import edu.ulima.eda.pilas.Stack;

/**
 *
 * @author JC
 */
public class Prob06 {
    public static void extractElementsAux(Node A, int X, Stack ans){
        //ans.push(A.value());
        
    }
    
    public static Stack extractElements(Node A, int X){
        Stack ans = new Stack();
        
        return ans;
    }
    
    public static void main(String[] args){
        //Crear el nodo raíz
        Node root = new Node(200);
        BinarySearchTree.insert(root, 180);
        BinarySearchTree.insert(root, 160);
        BinarySearchTree.insert(root, 270);
        BinarySearchTree.insert(root, 240);
        BinarySearchTree.insert(root, 290);
        BinarySearchTree.insert(root, 300);
       
    }        
}
