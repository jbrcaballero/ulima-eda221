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
public class Prob04 {
    
    public static boolean find(Node R, int X){
        //Caso base: arbol vacio
        if(R == null){
            //Si el arbol esta vacio, el elemento no se encuentra
            return false;                    
        }else{
            //Si el elemento coincide con la raiz, se retorna verdadero (encontrado)
            if(R.value() == X){
                return true;
            }else{
                //Dos posibilidades: Puede estar en el subarbol izquierdo o en el derecho
                return find(R.left(), X) || find(R.right(), X);
            }
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
        
        System.out.println(find(root, 12));
    }        
}
