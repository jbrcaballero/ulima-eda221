/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.guias.guia01;

/**
 *
 * @author JC
 */
public class Prob06 {
    public static int sumProperDivisors(int N){
        int sum = 0;
        for(int i = 1; i < N; i++){
            if(N % i == 0){
                sum += i;
            }
        }
        return sum;
    }
    
    public static boolean areAmicable(int M, int N){
        boolean ans = false;
        int divM = sumProperDivisors(M);
        int divN = sumProperDivisors(N);
        if(divM == N && divN == M){
            ans = true;
        }
        return ans;
    }
    public static void main(String args[]){
        int M = 220, N = 284;
        System.out.println("Son amigos: " + areAmicable(M, N));
    }
}
