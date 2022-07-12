/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.eda.guias.repaso;

/**
 *
 * @author JC
 */
public class Prob15 {
    static final int SOURCE_IDX = 0;
    //Precondicion: Ricardo vive en el distrito asociado al vertice 0
    public static int getBestDistrict(int[][] G, int[] R){        
        int maxRating = 0;
        int districtMaxRating = 0;
        boolean[] accessible = getAccessibleDistricts(G);
        for(int i = 0; i < accessible.length; i++){
            if(accessible[i] == true && R[i] > maxRating){
                maxRating = R[i];
                districtMaxRating = i;
            }
        }
        return districtMaxRating;                
    }
    public static boolean[] getAccessibleDistricts(int[][] G){
        boolean[] ans = new boolean[G.length]; //Por defecto: false
        //Vertices adyacentes
        for(int j = 0; j < G.length; j++){
            if(G[SOURCE_IDX][j] == 1){
                ans[j] = true;
                //Adyacentes a cada vertice adyacente
                for(int k = 0; k < G.length; k++){
                    if(G[j][k] == 1){
                        ans[k] = true;
                    }
                }
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {        
        /*
            0---1  
            |  /|\
            | / | 2 - 5 
            |/  |/
            4---3        
        */
        int[][] G = {        //  0  1  2  3  4  5 
                        /*0*/   {0, 1, 0, 0, 1, 0},
                        /*1*/   {1, 0, 1, 1, 1, 0},
                        /*2*/   {0, 1, 0, 1, 0, 1},
                        /*3*/   {0, 1, 1, 0, 1, 0},
                        /*4*/   {1, 1, 0, 1, 0, 0},
                        /*5*/   {0, 0, 1, 0, 0, 0}
                    };
        int[] maxRatings = {8, 7, 9, 6, 5, 10};
        
        int district = getBestDistrict(G, maxRatings);
        System.out.println("Distrito con el mejor restaurante: " + district);
        System.out.println("Calificacion del restaurante: " + maxRatings[district]);
        
    }        
}
