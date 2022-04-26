/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.guias.guia03;

/**
 *
 * @author JC
 */
public class Prob08 {
    
    public static boolean isSymmetric(int[][] M){
        boolean ans = true;
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M.length; j++){
                if(M[i][j] != M[j][i]){
                    ans = false;
                }
            }
        }
        return ans;
        
    }
    
    public static void main(String[] args){
        int[][] M =     {
                            {1, 4, 3},
                            {4, 5, 6},
                            {3, 6, 9}
                        };
        System.out.println(isSymmetric(M));
    }
}
