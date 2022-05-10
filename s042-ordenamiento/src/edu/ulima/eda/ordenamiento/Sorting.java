package edu.ulima.eda.ordenamiento;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JC
 */
public class Sorting {
    
    public static void bubbleSort(int[] A, int n){
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(A[j] > A[j + 1]){
                    int aux = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = aux;
                }
            }
        }
    }
    
    public static void selectionSort(int[] A, int n){
        for(int i = 0; i < n; i++){
            int p = i;
            for(int j = i + 1; j < n; j++){
                if(A[j] < A[p]){
                    p = j;
                }
            }
            if(p != i){
                int temp = A[p];
                A[p] = A[i];
                A[i] = temp;
            }
        }
    }
    
    public static void insertionSort(int[] A, int n){
        for(int i = 0; i < n; i++){
            int current = A[i];
            int position = i;
            while(position > 0 && A[position - 1] > current){
                A[position] = A[position - 1];
                position--;
            }
            A[position] = current;
        }
    }
    
}
