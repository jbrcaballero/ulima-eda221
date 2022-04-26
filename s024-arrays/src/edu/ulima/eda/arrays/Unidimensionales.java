package edu.ulima.eda.arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JC
 */
public class Unidimensionales {
    public static void showValues(int[] values){
        for(int i = 0; i < values.length; i++){
            System.out.println(values[i]);
        }
    }
    
    public static int getSum(int[] values){
        int sum = 0;
        for(int i = 0; i < values.length; i++){
            sum = sum + values[i];
        }
        return sum;
    }
    public static void main(String[] args){
        int[] values = {10, 234, 44, 34, 55};
        showValues(values);
        System.out.println("Suma de valores: " + getSum(values));
    }
}
