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
public class Prob03 {
    public static void showRightNodes(Node root){
        //Caso base: arbol vacio (no hay nodos que procesar)
        //En caso contrario...
        if(root != null){
            //Procesar la raiz
            System.out.println("Valor del Nodo: " + root.value());
            //Obtenemos una referencia al nodo derecho
            Node rightNode = root.right();
            //Si no hay nodo derecho
            if(rightNode == null){
                System.out.println("No hay nodo derecho");
            }else{
                System.out.println("Valor del nodo derecho: " + rightNode.value());
            }
            //Mostrar subarbol izquierdo
            showRightNodes(root.left());
            //Mostrar subarbol derecho
            showRightNodes(root.right());
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
        
        showRightNodes(root);
    }    
}
