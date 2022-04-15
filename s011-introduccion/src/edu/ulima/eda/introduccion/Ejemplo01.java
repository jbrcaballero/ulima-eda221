/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.introduccion;

/**
 *
 * @author JC
 */
public class Ejemplo01 {
    public static int getAverage(int n1, int n2, int n3){
        int sum = n1 + n2 + n3;
        int avg = sum / 3;
        if(sum % 3 == 2){
            avg = avg + 1;
        }
        return avg;
    }
    
    public static void main(String[] args){
        int resultado = getAverage(11, 13, 17);
        System.out.println(resultado);
        resultado = getAverage(12, 18, 14);
        System.out.println(resultado);
    }
}
