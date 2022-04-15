/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.guias.guia01;

/**
 *
 * @author JC
 */
public class Prob09 {
    
    
    //Precondicion: Una sola moda
    public static int getMode(int[] values){
        int maxCount = 0;
        int mode = -1;
        //Por cada elemento del array
        for(int i = 0; i < values.length; i++){
            int count = 0;
            //Contar cuantas veces aparece
            for(int j = 0; j < values.length; j++){
                if(values[j] == values[i]){
                    count = count + 1;                   
                }
            }
            //Comparamos la cantidad de apariciones con el maximo hasta ahora
            if(count > maxCount){
                maxCount = count;
                mode = values[i];
            }
        }
        return mode;
    }
    
    public static void main(String args[]){
        int[] values = {2, 3, 234, 3, 4, 45, 4, 3, 1239};
        System.out.println(getMode(values));
    }
}
