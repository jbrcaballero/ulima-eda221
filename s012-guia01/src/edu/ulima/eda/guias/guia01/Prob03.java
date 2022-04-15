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
public class Prob03 {
    public static boolean isPrime(int n){
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count = count + 1;
            }
        }
        if(count == 2){
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args){
        System.out.println(isPrime(13));
        System.out.println(isPrime(22));
    }
}
