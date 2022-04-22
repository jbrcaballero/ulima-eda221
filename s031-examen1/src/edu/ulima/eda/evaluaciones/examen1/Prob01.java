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
public class Prob01 {
    public static void printReport(int N, int M, int P){
        //Por cada digito
        for(int i = 0; i <= 9; i++){            
            int count = 0;
            if(M % 10 == i){
                count = count + 1;
            }
            if(N % 10 == i){
                count = count + 1;
            }
            if(P % 10 == i){
                count = count + 1;
            }
            System.out.println("Cantidad de numeros que terminan en " + i + ": " + count);            
        }
    }
    
    public static void main(String[] args){
        int M = 121;
        int N = 1211;
        int P = 12477432;
        printReport(M, N, P);
    }
}
