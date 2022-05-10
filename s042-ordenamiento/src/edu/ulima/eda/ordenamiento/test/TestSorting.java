/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.ordenamiento.test;

import edu.ulima.eda.ordenamiento.Sorting;
import java.util.Arrays;

/**
 *
 * @author JC
 */
public class TestSorting {
    public static void main(String[] args){
        int[] values = {20, 34, 4, 11, 67, 334, 3545, 33};
        Sorting.bubbleSort(values, values.length);
        System.out.println(Arrays.toString(values));
    }
}
