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
public class Prob07 {

    //7a
    public static void printProduction(int[] info){
        int parcel = 1;
        for(int i = 0; i < info.length; i+= 2){
            int oranges = info[i] + info[i + 1];            
            System.out.println("Produccion en la parcela " + parcel + ": " + oranges); 
            parcel = parcel + 1; //Tambien puede obtenerse en funcion de i
        }
    }

    public static void main(String[] args){
        int[] production = {100, 500, 600, 0, 800, 700};
        printProduction(production);
    }

}
