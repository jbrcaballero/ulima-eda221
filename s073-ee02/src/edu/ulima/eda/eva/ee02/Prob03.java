/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.eva.ee02;

import edu.ulima.eda.listas.LinkedList;
import edu.ulima.eda.listas.Node;

/**
 *
 * @author JC
 */
public class Prob03 {
    public static void showFailedPercentage(LinkedList L1, LinkedList L2){
        Node ptr = L1.getL();
        int numFailed = 0;
        int totalStudents = 0;
        while(ptr != null){
            if(ptr.value() < 11){
                numFailed = numFailed + 1;
            }
            totalStudents = totalStudents + 1;
            ptr = ptr.next();
        }
        ptr = L2.getL();
        while(ptr != null){
            if(ptr.value() < 11){
                numFailed = numFailed + 1;
            }
            totalStudents = totalStudents + 1;
            ptr = ptr.next();
        }
        float failedPercentage = 100f * numFailed / totalStudents;
        System.out.println("El porcentaje de desaprobados es: " + failedPercentage + " %");
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
