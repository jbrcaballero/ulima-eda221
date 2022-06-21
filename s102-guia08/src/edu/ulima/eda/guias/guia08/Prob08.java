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
public class Prob08 {
    public static int maxAux(int[] elements, int n){
        //Caso base: un solo elemento
        if(n == 1){
            return elements[0];
        }else{
            //Ultimo elemento
            int last = elements[n - 1];
            //Recursion
            int max2 = maxAux(elements, n - 1);
            //Elemento maximo: 
            //mayor entre el ultimo y el maximo elemento en el resto del array
            if(last > max2){
                return last;
            }else{
                return max2;
            }
        }
    }
    
    public static int max(int[] elements){
        return maxAux(elements, elements.length);
    }
    
    public static void main(String args[]){
        int[] elements = {10, 23, 4, 14, 54, 1};
        System.out.println(max(elements));
    }
}
