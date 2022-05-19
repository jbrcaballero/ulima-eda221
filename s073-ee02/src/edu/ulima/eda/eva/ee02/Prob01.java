/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.eva.ee02;

/**
 *
 * @author JC
 */
public class Prob01 {
    public static float getFinalGrade(int[] grades){
        float finalGrade = 0;
        int maxGradePart1 = 0;
        int maxGradePart2 = 0;
        for(int i = 0; i < grades.length; i++){
            if(i < grades.length / 2){
                if(grades[i] > maxGradePart1){
                    maxGradePart1 = grades[i];
                }
            }else{
                if(grades[i] > maxGradePart2){
                    maxGradePart2 = grades[i];
                }
            }           
        }
        finalGrade = 1.0f * (maxGradePart1 + maxGradePart2) / 2;
        return finalGrade;
    }
    
    public static void main(String args[]){
        int[] grades = {10, 12, 16, 11};
        float finalGrade = getFinalGrade(grades);
        System.out.println("La nota final es: " + finalGrade);
    }
    
}
