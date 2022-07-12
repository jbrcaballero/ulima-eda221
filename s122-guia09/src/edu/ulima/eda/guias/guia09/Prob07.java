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
public class Prob07 {
    
    public static void bfs(Node root){
        int height = getHeight(root);
        for(int i = 0; i < height; i++){
            System.out.print("Nodos nivel " + i + ": ");
            printLevel(root, i);
            System.out.println();
        }
    }
    
    //Version alternativa: Algoritmo iterativo
    public static void bfs2(Node root){
        Queue<Node> nodesLevel = new Queue<>();
        nodesLevel.enqueue(root);
        int level = 0;
        while(nodesLevel.isEmpty() == false){
            Queue<Node> nodesNextLevel = new Queue<>();
            System.out.print("Nodos nivel " + level + ": ");
            //Bucle interno: procesa un nivel
            while(nodesLevel.isEmpty() == false){                
                Node currNode = nodesLevel.dequeue();
                System.out.print(currNode.value() + "  ");
                if(currNode.left() != null){
                    nodesNextLevel.enqueue(currNode.left());
                }
                if(currNode.right() != null){
                    nodesNextLevel.enqueue(currNode.right());
                }
            }
            System.out.println();
            level = level + 1;            
            nodesLevel = nodesNextLevel;
        }
    }
    
    public static void printLevel(Node root, int n){
        //Solo procesamos un arbol no vacio
        if(root != null){
            //Si el nivel es cero: imprimimos la raiz            
            if(n == 0){
                System.out.print(root.value() + "  ");
            }else{
                //En caso contrario, buscamos en los subarboles
                printLevel(root.left(), n - 1);
                printLevel(root.right(), n - 1);
            }
        }
    }
    
    public static int getHeight(Node root){
        if(root == null){
            return 0;
        }else{
            int maxHeight = 0;
            int leftHeight = getHeight(root.left());
            int rightHeight = getHeight(root.right());
            
            if(leftHeight > rightHeight){
                maxHeight = leftHeight;
            }else{
                maxHeight = rightHeight;
            }
            return 1 + maxHeight;
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
        
        //bfs(root);
        bfs2(root);
    }
}
