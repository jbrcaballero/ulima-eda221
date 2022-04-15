/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.introduccion;

/**
 *
 * @author JC
 */

public class Ejemplo02 {        
    //Poscondicion:
    //- Primer valor: Suma de pares
    //- Segundo valor: Suma de impares
    
    public static int[] getOddEvenSum(int n){
        int sumEven = 0;
        int sumOdd = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                sumEven = sumEven + i; 
            }else{
                sumOdd = sumOdd + i;
            }         
        }
        int[] ans = {sumEven, sumOdd};              
        return ans;
    }
    
    public static void main(String[] args){
        int n = 6;
        int[] ans = getOddEvenSum(n);
        System.out.println("Suma pares: " + ans[0]);
        System.out.println("Suma impares: " + ans[1]);
    }
    
}
