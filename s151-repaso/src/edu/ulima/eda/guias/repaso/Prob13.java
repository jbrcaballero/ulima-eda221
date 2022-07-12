/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.eda.guias.repaso;

/**
 *
 * @author JC
 */
public class Prob13 {
    
    public static int getDegree(int[][] G, int index){
        int ans = 0;
        for(int j = 0; j < G.length; j++){
            ans = ans + G[index][j];
        }
        return ans;
    }
    
    public static void showAdjacentDegrees(int[][] G, int i){
        for(int j = 0; j < G.length; j++){
            if(G[i][j] == 1 && getDegree(G, j) > 2){
                System.out.println("El vertice " + j + " es adyacente a " + i 
                        + " y tiene un grado mayor que 2");
            }
        }                
    }
    
    public static void main(String[] args){
        int[][] G = {        //  0  1  2  3  4 
                        /*0*/   {0, 1, 0, 0, 1},
                        /*1*/   {1, 0, 1, 1, 1},
                        /*2*/   {0, 1, 0, 1, 0},
                        /*3*/   {0, 1, 1, 0, 1},
                        /*4*/   {1, 1, 0, 1, 0}
                    };
        showAdjacentDegrees(G, 1);
    }
}
