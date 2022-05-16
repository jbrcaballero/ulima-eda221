/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.guias.repaso1;

/**
 *
 * @author JC
 */
class SortedPrimeList{
    private int[] values;
    private int n;
    public static int MAX_SIZE = 100;
    
    
    public SortedPrimeList(){
        values = new int[MAX_SIZE];
        values[0] = 2;
        n = 1;
    }
    
    public boolean add(int item){
        if(this.contains(item) == false && isPrime(item) == true){
            int itemIndex = 0;
            while(values[itemIndex] <= item && itemIndex < n){
                itemIndex = itemIndex + 1;
            }
            for(int i = n; i >= itemIndex; i--){
                values[i+1] = values[i];
            }
            values[itemIndex] = item;
            n++;
        }
        return true;
    }
        
    public boolean contains(int ref){
        boolean ans = false;
        for(int i = 0; i < n; i++){
            if(this.values[i] == ref){
                ans = true;
            }
        }
        return ans;
    }
    
    private boolean isPrime(int n){
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count = count + 1;
            }
        }
        if(count == 2){
            return true;
        }else{
            return false;
        }
    }
    
    public void print(){
        for(int i = 0; i < this.n; i++){
            System.out.print(" " + this.values[i] + " ");
        }
        System.out.println();
    }
    
    
}

public class Prob04 {
    public static void main(String[] args){
        SortedPrimeList list = new SortedPrimeList();
        list.add(12);
        list.add(19);
        list.add(7);
        list.add(13);
        list.add(19);
        list.print();
    }
}
