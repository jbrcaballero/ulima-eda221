/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.nota01.repaso2;

import java.util.Arrays;
import static edu.ulima.eda.nota01.repaso2.util.Helper.isPrime;

/**
 *
 * @author JC
 */
public class Prob05 {    
    public static int[] merge(int[] A, int[] B, int exponent){
        int[] newArray = new int[A.length + B.length]; 
        for(int i = 0; i < A.length; i++){
            int value = A[i];
            if(isPrime(value) == true){
                value = value * value;
            }
            newArray[i] = value;
        }
        
        for(int i = 0; i < B.length; i++){
            int value = B[i];
            if(isPrime(value) == true){
                value = value * value;
            }
            newArray[A.length + i] = value;
        }
        
        return newArray;
    }
    /*
        Complejidad: El bloque que tendra el mayor tiempo de ejecucion (el mas
        "pesado", sera el que corresponda al array mas grande). Por lo tanto,
        podriamos expresar la complejidad de como O(max(m, n)), donde m es la 
        longitud del primer array y n es la longitud del segundo.
        
        Intuitivamente, si consideramos que el algoritmo se ocupa de llenar
        todo el array de destino que es de longitud (m+n), podriamos concluir 
        tambien que la complejidad del algoritmo es O(m+n). En ambos casos la 
        respuesta es correcta.
    
    */
    
    public static void main(String[] args){
        int[] A = {10, 12, 7};
        int[] B = {3, 14, 26};
        int exponent = 2;
        int[] C = merge(A, B, exponent);        
        System.out.println(Arrays.toString(C));
    }
}
