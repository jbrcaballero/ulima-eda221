/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.arboles.abb;

import edu.ulima.eda.arboles.BinaryTree;
import edu.ulima.eda.arboles.Node;

/**
 *
 * @author JC
 */
public class BinarySearchTree {
    public static boolean search(Node root, int item){
        if(root == null){   //Arbol vacio, no encontraremos el valor
            return false;
        }else if(root.value() == item){
            return true;    //Si coincide con la raiz, encontramos el valor
        }else{
            if(item < root.value()){
                //Si el valor buscado es menor que el valor del nodo raiz,
                //buscamos a la izquierda
                return search(root.left(), item);
            }else{
                //En caso contrario, buscamos a la derecha
                return search(root.right(), item);
            }
        }
    }
    
    public static Node insert(Node root, int item){
        if(root == null){ //Arbol vacio: creamos un nuevo nodo
            root =  new Node(item);
        }else if(item < root.value()){ 
            //Realizamos la insercion en el subarbol derecho
            root.setLeft(insert(root.left(), item));
        }else{//De manera analoga con el subarbol izquierdo
            root.setRight(insert(root.right(), item));            
        }
        return root;
    }
       
    public static void showElements(Node root){
        BinaryTree.printInorder(root);
        System.out.println();
    }    
}
