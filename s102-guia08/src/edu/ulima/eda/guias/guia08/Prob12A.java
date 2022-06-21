/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.guias.guia08;

import edu.ulima.eda.listas.LinkedList;
import edu.ulima.eda.listas.Node;

/**
 *
 * @author JC
 */
public class Prob12A {
    public static void showReversed(LinkedList list){
        showReversedAux(list.getL());
    }
    
    public static void showReversedAux(Node node){
        if(node != null){
            showReversedAux(node.next());
            System.out.println(node.value());
        }
    }
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.showElements();
        showReversed(list);
    }
}
