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
public class Prob01 {
    
    /*
    Objetivo:           Dados 3 enteros, retornar el numero mayor
    Entradas:           a, b y c - numeros enteros.
    Salidas:            ans - numero entero
    Precondicion:       a, b y c mayores que cero.
    Postcondicion:      ans contiene el mayor valor entre a, b y c
    */
    
    public static int max(int a, int b, int c){
        //Asumo que el mayor es a
        int ans = a;
        //Comparo con el valor de b
        if(ans < b){
            ans = b;
        }
        //Comparo con el valor de c
        if(ans < c){
            ans = c;
        }
        return ans;
    }
    
    public static void main(String[] args){
        int a = 14, b = 12, c = 18;
        int ans = max(a, b, c);
        System.out.println("El valor maximo es: " + ans);
    }
    
    
}
