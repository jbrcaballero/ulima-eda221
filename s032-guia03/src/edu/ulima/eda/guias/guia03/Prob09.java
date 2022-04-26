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
public class Prob09 {
    
    public static int getSales(int[][] V, int index){
        int total = 0;
        for(int i = 0; i < V.length; i++){
            total = total + V[i][index];
        }
        return total;
    }
    //month: mes a analizar (1 - 12)
    public static float getSalesAverage(int[][] V, int month){
        int sum = 0;
        for(int j = 0; j < V[0].length; j++){
            sum = sum + V[month - 1][j];
        }
        float average = 1.0f * sum / V[0].length;
        return average;
    }
    
    public static int getMonthMoreSales(int[][] V){
        int max = 0;
        int maxIndex = 0;
        for(int i = 0; i < V.length; i ++){
            int sum = 0;
            for(int j = 0; j < V[0].length; j++){
                sum = sum + V[i][j];
            }
            if(sum > max){
                max = sum;
                maxIndex = i;
            }
        }
        return maxIndex + 1;
    }
    
    public static void main(String[] args){
        String[] agencies = {"Trujillo", "Lima", "Tacna", "Cusco", "Piura"};
        int[][] V =     {
                            {300, 870, 430, 360, 380}, //enero
                            {300, 870, 430, 360, 880}, //febrero
                            {360, 920, 430, 360, 380}, 
                            {300, 870, 430, 360, 380}, 
                            {300, 870, 430, 360, 380},
                            {300, 870, 430, 360, 380},
                            {300, 870, 430, 360, 380},
                            {300, 870, 430, 360, 380},
                            {300, 870, 430, 360, 380}, 
                            {300, 870, 430, 360, 380}, 
                            {300, 870, 430, 360, 380}, 
                            {300, 870, 430, 360, 380}                                                       
                        };
        
        System.out.println(getSales(V, 0));
        System.out.println(getSalesAverage(V, 3));
        System.out.println(getMonthMoreSales(V));
    }
}
