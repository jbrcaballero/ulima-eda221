/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.eva.ee02;

import edu.ulima.eda.listas.LinkedList;

/**
 *
 * @author JC
 */
public class Prob03 {
    public static void showFailedPercentage(LinkedList L1, LinkedList L2){
        //TODO: Implementar
    }
    
    public static void main(String[] args){
        LinkedList L1 = new LinkedList();
        L1.addLast(14);
        L1.addLast(14);
        L1.addLast(11);
        L1.addLast(15);

        LinkedList L2 = new LinkedList();
        L1.addLast(12);
        L1.addLast(15);
        L1.addLast(18);
        L1.addLast(20); 
        L1.addLast(12);
        L1.addLast(9);
        
        showFailedPercentage(L1, L2);
    }
}
