/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.arrays;

/**
 *
 * @author JC
 */

//tinyurl.com/ulima-eda
public class Bidimensionales {
    public static void showRows(int[][] M){        
        for(int i = 0; i < M.length; i++){
            int sum = 0;
            for(int j = 0; j < M[0].length; j++){
                System.out.print(M[i][j] + " ");
                sum = sum + M[i][j];
            }
            System.out.println("--> " + sum);
        }        
    }
    
    public static void showRowSums(int[][] M){
        for(int i = 0; i < M.length; i++){
            int sum = 0;
            for(int j = 0; j < M[0].length; j++){
                sum = sum + M[i][j];
            }
            System.out.println("Suma elementos fila " + i + ": " + sum);
        }                
    }
	    
    public static void showColumns(int[][] M){
        for(int j = 0; j < M[0].length; j++){
            for(int i = 0; i < M.length; i++){
                System.out.print(M[i][j] + " ");                
            }
            System.out.println();
        }        
    }
    

    public static void main(String[] args){
        int[][] M =     {
                            {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}
                        };
        showRows(M);
        showColumns(M);
        showRowSums(M);
    }
}
