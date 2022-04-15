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
public class Prob02 {
   
    public static int digitalRoot(int n){
        int sum = 0;
        if(n < 10){
            //Numero  de una sola cifra, la raiz digital es el mismo numero
            return n;
        }else{
            //Calculamos suma de cifras
            while(n > 0){
                //Hallar el ultimo digito
                int digit = n % 10;
                //Incrementar la suma, considerando el digito
                sum = sum + digit;
                //Quitar el ultimo digito
                n = n / 10;
            }
            //El resultado sera la raiz digital de la suma de cifras
            return digitalRoot(sum);
        }
    }
    
    public static void main(String[] args){
        int n = 347;
        int ans = digitalRoot(n);
        System.out.println("Raiz digital: " + ans);
    }
}
