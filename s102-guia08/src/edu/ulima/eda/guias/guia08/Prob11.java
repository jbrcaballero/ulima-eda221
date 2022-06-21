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
public class Prob11 {
    public static int count(LinkedList list){
        return countAux(list.getL());
    }
    
    //Metodo auxiliar
    private static int countAux(Node node){
        //Caso base: lista vacia
        if(node == null){
            return 0;
        }else{
            return 1 + countAux(node.next());
        }
    }
    
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addLast(20);
        list.addLast(55);
        list.addLast(45);
        list.addLast(14);
        System.out.println(count(list));
    }
    
}
