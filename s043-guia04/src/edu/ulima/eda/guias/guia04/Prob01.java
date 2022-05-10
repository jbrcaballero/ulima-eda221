/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.guias.guia04;

/**
 *
 * @author JC
 */
class Set {
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
    
    //Esta vacio
    public boolean isEmpty(){
        boolean ans;
        if(this.n == 0){
            ans = true;
        }else{
            ans = false;
        }
        return ans;
    }
    
    public static Set union(Set A, Set B){
        Set ans = new Set();
        //TODO: Implementar
        return ans;
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
public class Prob01 {
    public static void main(String[] args){
        Set s = new Set();
        s.add(12);
        s.add(25);
        s.add(236);
        s.print();
        s.add(12);
        s.print();
        s.add(19);
        s.add(25);
        s.print();
        System.out.println(s.contains(12));
        System.out.println(s.contains(77));
        System.out.println(s.isEmpty());
    }
}
