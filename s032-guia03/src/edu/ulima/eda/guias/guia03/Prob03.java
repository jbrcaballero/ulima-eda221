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
public class Prob03 {
    //Precondicion: Ambos arrays tienen la misma longitud
    //Tarea: Revise los cambios necesarios al programa para soportar arrays de 
    //tamano diferente
    public static int compare(int[] A, int[] B){
        //Variables logicas que indican si es igual, menor o mayor respectivamente
        boolean equal = true;
        boolean lt = true;
        boolean gt = true;        
        for(int i = 0; i < A.length; i++){
            if(A[i] > B[i]){
                equal = false;
                lt = false;
            }else if(A[i] < B[i]){
                gt = false;
                equal = false;
            }else{//Son iguales
                gt = false;
                lt = false;
            }
        }
        if(equal == true){
            return 1;
        }else if(lt == true){
            return 2;
        }else if(gt == true){
            return 3;
        }else{
            return 0;
        }
    }
    public static void main(String[] args){
        int[] A1 = {2, 23, 43, 56, 7, 11, 3249};
        int[] A2 = {3, 44, 46, 77, 95, 34, 4500};
        int[] A3 = {4, 44, 46, 77, 95, 34, 4500};
        System.out.println(compare(A1, A1));
        System.out.println(compare(A1, A2));
        System.out.println(compare(A2, A1));
        System.out.println(compare(A2, A3));
    }
    
}
