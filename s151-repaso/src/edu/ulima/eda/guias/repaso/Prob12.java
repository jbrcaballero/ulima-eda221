/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.eda.guias.repaso;

/**
 *
 * @author JC
 */
public class Prob12 {
    public static int getFriendliest(int[][] G){
        int maxFriends = 0;
        int indexMaxFriends = 0;
                
        for(int i = 0; i < G.length; i++){
            int numberOfFriends = 0;
            for(int j = 0; j < G.length; j++){
                numberOfFriends = numberOfFriends + G[i][j];
            }
            if(numberOfFriends > maxFriends){
                maxFriends = numberOfFriends;
                indexMaxFriends = i;
            }
        }
        return indexMaxFriends;
    }
    
    public static void main(String[] args){
        int[][] G = {        //  0  1  2  3  4 
                        /*0*/   {0, 1, 0, 0, 1},
                        /*1*/   {1, 0, 1, 1, 1},
                        /*2*/   {0, 1, 0, 1, 0},
                        /*3*/   {0, 1, 1, 0, 1},
                        /*4*/   {1, 1, 0, 1, 0}
                    };
        System.out.println(getFriendliest(G));
    }
}
