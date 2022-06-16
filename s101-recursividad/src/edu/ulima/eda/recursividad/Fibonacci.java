/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.recursividad;

/**
 *
 * @author JC
 */
public class Fibonacci {
    public static long fibonacci(int n){
        //Caso base
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            //Recursion
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
            
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(8));
    }
}
