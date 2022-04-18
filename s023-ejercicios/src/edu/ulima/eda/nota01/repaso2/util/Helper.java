/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.nota01.repaso2.util;

/**
 *
 * @author JC
 */
public class Helper {
    public static boolean isPrime(int n){
        int countDiv = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                countDiv = countDiv + 1;
            }
        }
        if(countDiv == 2){
            return true;
        }else{
            return false;
        }
    }
    
    public static void copyArray(int[] source, int[] destination, int initialIndex){
        for(int i = 0; i < source.length; i++){
            
        }
    }
}
