package edu.ulima.eda.nota01.repaso2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JC
 */
public class Prob01 {
    public static int getNumbers(int N){
        int count = 0;
        for(int i = 1; i <= N; i++){
            //Dos condiciones: division exacta y 3 como ultima cifra
            if(N % i == 0 && i % 10 == 3){
                System.out.println("El numero " + i + " cumple las condiciones");
                count = count + 1;
            }
        }
        return count;
    }
    /*
        Complejidad del algoritmo: O(N)
        El bloque con la mayor cantida de instrucciones es el bucle for. Este
        bucle se ejecutara para valores entre [1, N]. Por lo tanto, podemos 
        decir que la complejida es lineal.        
    */
         
    
    public static void main(String[] args){
        int count = getNumbers(39);
        System.out.println("Cantidad de numeros que cumplen la condicion: " + count);
    }
}
