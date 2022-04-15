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

//Precondicion: i <= cantidad de digitos de N
public class Prob04 {
    public static int getDigit(int N, int i){
        //Posicion inicial
        int position = 1;        
        int digit = -1;
               
        while(N >= 0 && i >= position){
            //Obtener el valor del ultimo digito
            digit = N % 10;
            //Eliminar el ultimo digito
            N = N / 10;
            position = position + 1;
        }
        return digit;
    }
    //3487598
    
    public static void main(String[] args){
        int N = 323487384;
        System.out.println(getDigit(N, 5));
    }
}
