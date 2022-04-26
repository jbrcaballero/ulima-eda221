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
public class Prob04 {
    public static void showWinner(int[] power1, int[] power2){
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < power1.length; i++){
            if(power1[i] > power2[i]){
                count1 = count1 + 1;
            }else if (power1[i] < power2[i]){
                count2 = count2 + 1;
            }
        }
        if(count1 > count2){
            System.out.println("Jugador 1 deberia ganar la partida");
        }else if(count1 < count2){
            System.out.println("Jugador 2 deberia ganar la partida");
        }else{
            System.out.println("Resultado mas probable: empate");
        }
    }
    
    public static void main(String[] args){
        int[] power1 = {100, 150, 220};
        int[] power2 = {90, 240, 624};
        showWinner(power1, power2);        
    }
}
