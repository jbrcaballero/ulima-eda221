/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.evaluaciones.ee02.simulacro;

import edu.ulima.eda.pilas.Stack;
import java.util.Arrays;

/**
 *
 * @author JC
 */
/*
    a) Implemente un TDA que extienda la funcionalidad de pilas y, dado un entero n
    de 2 cifras, agregue cada dígito como elemento de la pila. Agregue primero
    el digito de las decenas y luego el digito de las unidaes.
    Ejemplo:
        P.pushAll(67);
        El llamado agregará a la pila el elemento 6 y el elemento 7.

    b) Agregue una operacion adicional que reciba un entero n con la cantidad
    de elementos a eliminar. El algoritmo deberá retornar un array con los 
    elementos eliminados. No es relevante el orden de dichos elementos
*/

class StackP02 extends Stack{
    public void pushAll(int n){
        int element1 = n / 10;
        int element2 = n % 10;        
        this.push(element1);
        this.push(element2);
        
    }
    //Precondicion: "n" no excede la cantidad de elementos de la pila
    public int[] pop(int n){  
        int[] ans = new int[n];
        for(int i = 0; i < n && this.isEmpty() == false; i++){
            ans[i] = this.pop();
        }
        return ans;
    }
}

public class Prob02 {
    public static void main(String[] args){
        StackP02 s = new StackP02();
        s.push(12);
        s.push(6);
        s.push(9);
        s.push(15);
        s.showElements();
        s.pushAll(87);
        s.showElements();
        
        int[] elements = s.pop(2);
        System.out.println("Elementos extraidos: " + Arrays.toString(elements));
        
    }
}



