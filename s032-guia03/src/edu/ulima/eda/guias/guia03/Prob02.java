/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.guias.guia03;

/**
 *
 * @author JC
 */
public class Prob02 {
    public static void showStats(int[] values){
        int max = values[0];
        int min = values[0];
        
        for(int i = 0; i < values.length; i++){
            if(values[i] > max){
                max = values[i];
            }
            if(values[i] < min){
                min = values[i];
            }
        }
        System.out.println("Valor maximo: " + max);
        System.out.println("Valor minimo: " + min);
    }
    
    public static void main(String[] args){
        int[] values = {10, 12, 434, 8, 500, 34, 55};
        showStats(values);
    }
}
