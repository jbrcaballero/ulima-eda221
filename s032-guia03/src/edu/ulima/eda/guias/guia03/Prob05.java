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
public class Prob05 {
    
    public static int countNotAttended(int[] T, int[] L, int t1){
        int totalMinutes = t1 * 60;
        int count = 0;
        int ans = 0;
                
        for(int i = 0; i < L.length; i++){
            //L[i] nos da el codigo del tramite (inicia en 1), con ello hallamos el tiempo
            int time = T[L[i] - 1];
            if(count + time < totalMinutes){
                count = count + time;
            
            }else{
                //No se atendera a la persona, termina el conteo
                if(count + time > totalMinutes){
                    ans = L.length - i;
                //Se atendera a la persona y terminara el conteo
                }else{
                    ans = L.length - (i + 1);
                }
                break;
            } 
        }
        return ans;
    }
    
    public static void main(String[] args){
        int t1 = 2;
        int[] T = {60, 20, 30};
        int[] L = {1, 1, 2, 2, 3};
        int ans = countNotAttended(T, L, t1);
        System.out.println("Cantidad de personas no atendidas: " + ans);
        
    }
}
