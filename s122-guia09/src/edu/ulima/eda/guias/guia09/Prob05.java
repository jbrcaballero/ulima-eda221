/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.guias.guia09;

import edu.ulima.eda.arboles.Node;

/**
 *
 * @author JC
 */
public class Prob05 {
    public static void showOneChild(Node root){
        //Caso base: arbol vacio (no se muestra ningun valor)
        //En caso contrario, se procesa el arbol
        if(root != null){
            //Verificamos si el nodo raiz tiene un solo hijo
            //1) Que el nodo no sea hoja
            if(root.left() != null || root.right() != null){
                //2) Que alguno de los 2 nodos tenga un valor nulo
                if(root.left() == null || root.right() == null){
                    System.out.println("El nodo " + root.value() + " tiene un solo hijo");
                }
            }
            //Recursion: Procesar subarbol izquierdo y subarbol derecho
            showOneChild(root.left());
            showOneChild(root.right());
            
        }
        /*
            Otra forma:
            if(root.left() == null && root.right() != null 
                    || root.left() != null && root.right() == null){                
            }
            Otra forma: Operador XOR.
        */
    }
    
    public static void main(String[] args){
        /*
                    9
                  /   \
                 14   28
                /       \
               20       12
        
        */ 
        
        Node root = new Node(9);
        
        Node node2 = new Node(14);
        Node node3 = new Node(28);
        
        root.setLeft(node2);
        root.setRight(node3);
        
        Node node4 = new Node(20);
        
        node2.setLeft(node4);
        
        Node node6 = new Node(12);        
        node3.setRight(node6);
        showOneChild(root);
        
    }        
}
