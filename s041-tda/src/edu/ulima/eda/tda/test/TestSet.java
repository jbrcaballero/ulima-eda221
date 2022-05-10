/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.tda.test;
import edu.ulima.eda.tda.Set;

/**
 *
 * @author JC
 */
public class TestSet {
    public static void main(String[] args){
        Set s = new Set();
        s.add(12);
        s.add(25);
        s.add(236);
        s.print();
        s.add(12);
        s.print();
        System.out.println(s.contains(12));
        System.out.println(s.contains(77));
    }
    
}
