/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.guias.repaso1;

/**
 *
 * @author JC
 */
public class Prob01 {
    public static int dotProduct(int[] A, int[] B){
        int result = 0;
        for(int i = 0; i < A.length; i++){
            result = result + (A[i] * B[i]);
        }
        return result;
    }
    public static void main(String[] args){
        int[] A = {10, 3, 4};
        int[] B = {2, 6, 2};
        System.out.println(dotProduct(A, B));
    }
}
