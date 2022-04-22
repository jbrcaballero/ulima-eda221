/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.evaluaciones.examen1;

/**
 *
 * @author JC
 */
public class Prob03 {
    public static boolean isPerfectSquare(int n){
        for(int i = 1; i * i <= n; i++){
            if(n == i * i){
                return true;
            }
        }
        return false;
    } 
    
    public static boolean isPerfectCube(int n){
        for(int i = 1; i * i * i <= n; i++){
            if(n == i * i * i){
                return true;
            }
        }
        return false;    
    }
    
    public static boolean containsDigit(int n, int d){
        while(n > 0){
            if(n % 10 == d){
                return true;
            }
            n = n / 10;
        }
        return false;
    }
    
    public static void printReport(int A, int B){
        //TODO: Implementar
        int countPerfectSquare = 0;
        int countPerfectCube = 0;
        int countFourDigits = 0;
        int countDigitSeven = 0;
        for(int i = A; i <= B; i++){
            if(isPerfectSquare(i) == true){
                countPerfectSquare = countPerfectSquare + 1;                
            }
            if(isPerfectCube(i) == true){
                countPerfectCube = countPerfectCube + 1;                
            }
            if(i >= 1000 && i < 10000){
                countFourDigits = countFourDigits + 1;
            }
            if(containsDigit(i, 7) == true){
                countDigitSeven = countDigitSeven + 1;
            }
        }
        System.out.println("Cantidad de cuadrados perfectos: " + countPerfectSquare);
        System.out.println("Cantidad de cubos perfectos: " + countPerfectCube);
        System.out.println("Cantidad de numeros de 4 cifras: " + countFourDigits);
        System.out.println("Cantidad de numeros con un digito 7: " + countDigitSeven);
    }
    public static void main(String[] args){
        printReport(1, 1000);
    }
}
