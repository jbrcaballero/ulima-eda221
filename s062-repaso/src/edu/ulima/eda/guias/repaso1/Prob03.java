/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.guias.repaso1;

import edu.ulima.eda.listas.LinkedList;
import edu.ulima.eda.listas.Node;

/**
 *
 * @author JC
 */
public class Prob03 {
    public static void showStatistics(LinkedList gradeList){
        Node ptr = gradeList.getL();
        int countFailed = 0;
        int countOutstanding = 0;
        int total = 0;
        while(ptr != null){
            int grade = ptr.value();
            total = total + 1;
            if(grade < 11){
                countFailed = countFailed + 1;
            }else if(grade > 16){
                countOutstanding = countOutstanding + 1;
            }
            ptr = ptr.next();
        }
        System.out.println("Total de alumnos: " + total);
        System.out.println("Porcentaje reprobados: " + (100.0 * countFailed / total) + "%");
        System.out.println("Porcentaje sobresalientes: " + (100.0 * countOutstanding / total) + "%");
    }
    
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addLast(12);
        list.addLast(8);
        list.addLast(14);
        list.addLast(11);
        list.addLast(18);
        list.addLast(20);
        list.addLast(7);
        list.addLast(5);
        showStatistics(list);
    }
}
