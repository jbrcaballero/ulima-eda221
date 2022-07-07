/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.arboles.abb.test;

import edu.ulima.eda.arboles.Node;
import edu.ulima.eda.arboles.abb.BinarySearchTree;

/**
 *
 * @author JC
 */
public class TestBst {
    public static void main(String[] args){
        Node root = BinarySearchTree.insert(null, 27);
        BinarySearchTree.insert(root, 88);
        BinarySearchTree.insert(root, 18);
        BinarySearchTree.insert(root, 36);
        BinarySearchTree.insert(root, 21);
        BinarySearchTree.insert(root, 16);
        
        BinarySearchTree.showElements(root);
        
        System.out.println(BinarySearchTree.search(root, 55));
        
    }
}
