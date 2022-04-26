/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.guias.guia03;

import java.util.Arrays;

/**
 *
 * @author JC
 */
public class Prob06 {
    //6a
    public static int[] getSubstractions(int[] A){
        //El nuevo array tendra un elemento menos que el original
        int[] ans = new int[A.length - 1];
        for(int i = 0; i < A.length - 1; i++){
            ans[i] = A[i + 1] - A[i];
        }
        return ans;
    }
    //6b
    public static void replaceSubstractions(int[] A){
        //Conversion directa: El ultimo elemento queda con su valor original
        for(int i = 0; i < A.length - 1; i++){
            A[i] = A[i + 1] - A[i];
        }
    }
    
    public static void main(String[] args){
        int[] A = {2, 23, 43, 56, 76, 66, 80};        
        System.out.println("Array inicial: " + Arrays.toString(A));
        int[] ans = getSubstractions(A);        
        System.out.println("Array obtenido: " + Arrays.toString(ans));
        replaceSubstractions(A);
        System.out.println("Array convertido: " + Arrays.toString(A));

    }
}
