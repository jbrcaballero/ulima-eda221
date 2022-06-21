package edu.ulima.eda.guias.guia08;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JC
 */
public class Prob09 {
    public static boolean allPositive(int[] A){
        return allPositiveAux(A, A.length);
    }
    
    public static boolean allPositiveAux(int[] A, int n){
        if(n == 0){
            return true;
        }else if(A[n - 1] < 0){
            return false;
        }else{
            return allPositiveAux(A, n - 1);
        }
    }
    public static void main(String[] args) {
        int[] A = {-1, 2, 3, 4};
        System.out.println(allPositive(A));
    }
    
}
