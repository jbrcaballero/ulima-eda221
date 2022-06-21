/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.guias.guia08;

/**
 *
 * @author JC
 */
public class Prob05 {
    public static int getSumAux(int[] elements, int n){
        //Caso base: cero elementos
        if(n == 0){
            return 0;
        }else{
            //Recursion: ultimo elemento + suma de elementos del resto
            return elements[n - 1] + getSumAux(elements, n - 1);
        }
    }
    
    public static int getSum(int[] elements){
        return getSumAux(elements, elements.length);
    }
    
    public static void main(String[] args){
        int[] elements = {2, 34, 44, 100};
        System.out.println(getSum(elements));
    }
    
    
}
