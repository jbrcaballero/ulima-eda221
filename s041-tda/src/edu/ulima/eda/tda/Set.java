/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.tda;

/**
 *
 * @author JC
 */
public class Set {
    //Almacena los elementos
    private int[] arr;
    //Cantidad de elementos almacenados
    private int n;
    //Tamano maximo del conjunto
    private static final int MAX_SIZE = 1000;
    
    //Crear Conjunto
    public Set(){
        this.arr = new int[MAX_SIZE];
        this.n = 0;
    }
    
    //Agregar elemento
    public void add(int element){
        //Verificar si el elemento se encuenta o no en el conjunto
        if(this.contains(element) == false){
            //Agregar el elemento al conjunto
            this.arr[n] = element;
            this.n = this.n + 1;            
        }
    }
    
    //Verificar si el elemento pertenece
    public boolean contains(int ref){
        boolean ans = false;
        for(int i = 0; i < n; i++){
            if(this.arr[i] == ref){
                ans = true;
            }
        }
        return ans;
    }
    
    public void print(){
        for(int i = 0; i < this.n; i++){
            System.out.print(" " + this.arr[i] + " ");
        }
        System.out.println();
    }
    
}
