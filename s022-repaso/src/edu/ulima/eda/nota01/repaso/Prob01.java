/*
    Implemente un algoritmo que, dado un numero entero positivo N
    y un digito d, retorne la cantidad de apariciones del digito d
    en N.
 */
package edu.ulima.eda.nota01.repaso;

/**
 *
 * @author JC
 */
public class Prob01 {
    
    public static int countDigits(int N, int d){
        int count = 0;
        while(N > 0){
            int digit = N % 10;
            if(digit == d){
                count = count + 1;
            }
            N = N / 10;
        }
        return count;
    }
    
    //Metodo auxiliar, solo como ejemplo ilustrativo
    public static void showDigits(int N){
        System.out.println("Los digitos de " + N + " son:");                 
        while(N > 0){
            int digit = N % 10;
            System.out.println(digit);
            N = N / 10;
        }
    }    
    
    public static void main(String[] args){
        int N = 372348733;
        int d = 3;
        showDigits(N);
        int count = countDigits(N, d);
        System.out.println("El digito " + d + " aparece " + count + " veces en " + N );
                
    }
}
