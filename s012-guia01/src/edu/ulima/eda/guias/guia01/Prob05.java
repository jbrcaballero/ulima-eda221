/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.guias.guia01;
/**
 * El algoritmo tiene una restriccion importante - precondicion,
 * que los valores de M y N son menores que 1000. En ese caso
 * podemos afirmar que tendran 3 cifras como maximo. Podemos
 * usar ello para solucionar el ejercicio.
 */
public class Prob05 {
    /*
        Retorna un array con los siguientes elementos:
        - Primer elemento: Numero formado por los digitos de orden par
        - Segundo elemento: Numero formado por los digitos de orden impar
    */
    public static int[] getNumbers(int number){
        //Si el numero tiene 3 cifras
        int n = 0;
        
        int contador = 3;
        while(contador <= n){
            contador = contador + 1;
            for(int i = 0; i < 100; i++){
                System.out.println(contador);
            }
        }
        
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int k = 0;
                while(k < n + 3){
                    k = k + 2;
                }
            }
        }
        
        
        int firstDigit = 0, secondDigit = 0, thirdDigit = 0;
        if(number >= 100){
            firstDigit = (number / 100) % 10;
            secondDigit = (number / 10) % 10;
            thirdDigit = number % 10;
        //Si el numero tiene 2 cifras
        }else if(number >= 9){
            firstDigit = (number / 10) % 10;
            secondDigit = number % 10;
        //Si el numero tiene una cifra
        }else{
            firstDigit = number % 10;
        }
        //Separamos los casos de suma de pares e impares. Observemos que,
        //al ser de 3 cifras como maximo, la suma de digitos pares sera igual
        //al valor del segundo digito.
        int oddSum = firstDigit * 10 + thirdDigit;
        int evenSum = secondDigit;
        int ans[] = {oddSum, evenSum};
        return ans;
    }
    
    public static int getDigitSum(int M, int N){
        //Utilizamos la funcion anterior.
        //Para obtener el numero formado por los digitos impares de M, obtenemos
        //el segundo elemento del array de respuesta
        int sumEvenDigitsM = getNumbers(M)[1];
        //De forma analoga, obtendremos el numero formato por los digitos pares
        //de N con el primer elemento del array de respuesta
        int sumOddDigitsN = getNumbers(N)[0];
        return sumEvenDigitsM + sumOddDigitsN;
    }
   
    public static void main(String[] args){
        int M = 25;
        int N = 965;
        System.out.println(getDigitSum(M, N));
    }
    /*
        Tarea: ¿Como seria para un numero de n cifras?
    */
}