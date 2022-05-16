/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.guias.repaso1;

import java.util.Arrays;

/**
 *
 * @author JC
 */
public class Prob02 {
    public static int[][] getResult(int[][] A, int[][] B, int[][] C){
        int[][] result = new int[A.length][A[0].length];
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[0].length; j++){
                result[i][j] = A[i][j] + B[i][j] - C[i][j];
            }
        }
        return result;
    }
    
    public static void printColumnSum(int[][] matrix){
        for(int j = 0; j < matrix.length; j++){
            int sum = 0;
            for(int i = 0; i < matrix.length; i++){
                sum = sum + matrix[i][j];
            }
            System.out.println("Suma de elementos columna " + j + ": " + sum); 
        }
    }
    public static void main(String[] args){
        int[][] A = {
                        {1, 2},
                        {1, 2}
                    };

        int[][] B = {
                        {2, 2},
                        {2, 2}
                    };        

        int[][] C = {
                        {1, 0},
                        {1, 0}
                    };
        
        int[][] result = getResult(A, B, C);
        printColumnSum(result);
    }
    
}
