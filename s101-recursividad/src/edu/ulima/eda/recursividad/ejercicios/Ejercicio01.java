/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.recursividad.ejercicios;

/**
 *
 * @author JC
 */

//Calcule la suma de digitos paraes de un numero entero n
public class Ejercicio01 {
    public static int sumEvenDigits(int n){
        //Caso base: Valor cero
        if(n == 0){
            return 0;
        }else{
            /*
                Recursion:  Ultimo digito + Suma digitos del numero sin
                            considerar el ultimo
            */
            int sum = 0;
            int lastDigit = n % 10;
            //Validar si es par
            if(lastDigit % 2 == 0){
                sum = sum + lastDigit;
            }            
            return sum + sumEvenDigits(n / 10);
        }        
    }
    
    public static void main(String[] args){
        System.out.println(sumEvenDigits(2546));
    }
    
}
