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
public class Prob02 {
    public static int pow(int x, int n){
        //Caso base
        if(n == 0){
            return 1;
        }else if(n % 2 == 0){
            return pow(x * x, n / 2);
        }else{
            return x * pow(x, n - 1);
        }
    }
    
    public static void main(String[] args){
        System.out.println(pow(4, 3));
        System.out.println(pow(3, 4));
        System.out.println(pow(2, 6));
    }
}
