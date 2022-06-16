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
public class Prob01 {
     public static float getSum(int n){
         //Caso Base
         if(n == 1){
             return 1;
         }else{
             //Recursion
             return 1.0f/n + getSum(n - 1);
         }
     }
     
     public static void main(String[] args){
         System.out.println(getSum(1));
         System.out.println(getSum(2));
         System.out.println(getSum(3));
     }
     
}
