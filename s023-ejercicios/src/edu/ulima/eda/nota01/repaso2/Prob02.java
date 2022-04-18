/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.nota01.repaso2;

/**
 *
 * @author JC
 */
public class Prob02 {
    public static void getCoprimeList(int N, int k){
        for(int i = 2; i <= N; i++){
            if(areCoprime(i, k) == true){
                System.out.println(i + " y " + k + " cumplen la condicion");
            }
        }    
    }
    
    public static boolean areCoprime(int a, int b){
        boolean ans = true;
        int min = a;
        if(b < min){
            min = b;
        }
        for(int i = 2; i <= min; i++){
            if(a % i == 0 && b % i == 0){
                ans = false;
                break;
            }
        }
        return ans;
    }
    
    public static void main(String[] args){
        int N = 4;
        int k = 20;
        getCoprimeList(N, k);
    }
}
