/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.eda.guias.repaso;
import static edu.ulima.eda.guias.repaso.Prob13.getDegree;

/**
 *
 * @author JC
 */
public class Prob14 {
    

    
    public static void showLowestDegree(int[][] G, int[] vertices){
        int lowestDegree = G.length;
        int vertexLowestDegree = 0;
        for(int i = 0; i < vertices.length; i++){
            int degree = getDegree(G, vertices[i]);
            if( degree < lowestDegree){
                lowestDegree = degree;
                vertexLowestDegree = vertices[i];
            }
        }
        System.out.println("Vertice de menor grado: " + vertexLowestDegree);
    }
    
    public static void main(String[] args){
        int[][] G = {        //  0  1  2  3  4 
                        /*0*/   {0, 1, 0, 0, 1},
                        /*1*/   {1, 0, 1, 1, 1},
                        /*2*/   {0, 1, 0, 1, 0},
                        /*3*/   {0, 1, 1, 0, 1},
                        /*4*/   {1, 1, 0, 1, 0}
                    };
        int[] vertices = {1, 2, 3};
        showLowestDegree(G, vertices);
    }
}
