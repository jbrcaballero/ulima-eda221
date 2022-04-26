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
public class Prob01 {
    
    public static int countEven(int[] numbers){
        int count = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
                count = count + 1;
            }
        }
        return count;
    }
    
    public static void main(String[] args){
        int[] elements = {2, 23, 43, 56, 7, 11, 3249};
        int ans = countEven(elements);
        System.out.println("Cantidad de numeros pares: " + ans);
    }
    
}
