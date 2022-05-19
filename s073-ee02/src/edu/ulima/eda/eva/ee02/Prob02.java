/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.eva.ee02;

/**
 *
 * @author JC
 */
public class Prob02 {
    public static void showAvailability(int[][] M){
        for(int i = 0; i < M.length; i++){
            int numAvailable = 0;
            for(int j = 0; j < M[0].length; j++){
                numAvailable = numAvailable + M[i][j];
            }
            if(numAvailable >= 3){
                System.out.println("La fila " + (i + 1) + " tiene 3 o mas asientos disponibles");
            }
        }
    }
    public static void main(String[] args){
        int[][] M = {  
                        {0, 1, 1, 1},
                        {0, 0, 0, 1} 
                    };
        showAvailability(M);
    }
}
