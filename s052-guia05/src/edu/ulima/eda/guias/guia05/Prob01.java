package edu.ulima.eda.guias.guia05;

import edu.ulima.eda.listas.LinkedList;
import edu.ulima.eda.listas.Node;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JC
 */

class ListP01 extends LinkedList{
    public int size(){
        int count = 0;
        Node ptr = this.getL();
        while(ptr != null){
            count = count + 1;
            ptr = ptr.next();
        }        
        return count;
    }
}

public class Prob01 {    
    public static void main(String[] args){
        ListP01 list = new ListP01();
        list.addLast(10);
        list.addLast(344);
        list.addLast(80);
        list.addLast(33);
        list.addLast(77);
        list.showElements();
        System.out.println(list.size());
    }           

}
