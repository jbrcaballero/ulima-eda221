/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.guias.guia10;

import edu.ulima.eda.arboles.Node;
import edu.ulima.eda.arboles.abb.BinarySearchTree;

/**
 *
 * @author JC
 */
public class Prob04 {
    //Precondicion: Arbol no esta vacio
    public static int min(Node root){
        Node ptr = root;
        while(ptr.left() != null){
            ptr = ptr.left();
        }
        return ptr.value();
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
