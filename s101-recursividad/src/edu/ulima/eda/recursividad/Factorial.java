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
public class Factorial {
    
    public static long factorial(int n){
        //Caso base
        if(n == 0){
            return 1;
        }else{
            //Recursion
            return n * factorial(n - 1);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(factorial(6));
    }
}
