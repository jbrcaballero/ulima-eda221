/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.guias.guia09;

import edu.ulima.eda.arboles.genericos.Node;

/**
 *
 * @author JC
 */
public class Prob08 {
    static class Student{
        private int cod;
        private String nom;
        private double pf;

        public Student(int cod, String nom, double pf){
            this.cod = cod;
            this.nom = nom;
            this.pf = pf;
        }
        
        public int getCod() {
            return cod;
        }

        public String getNom() {
            return nom;
        }

        public double getPf() {
            return pf;
        }
        
        public String toString(){
            return nom + "-" + pf;
        }

        public void setPf(double pf) {
            this.pf = pf;
        }
        
    }
    
    public static void replaceGrade(Node<Student> root, String NN, double pp){
        //Caso base: arbol vacio
        if(root != null){
            //Verificar si el elemento buscado es el nodo raiz
            Student st = root.value();
            if(st.getNom().equals(NN)){
                st.setPf(pp);
            }else{
                replaceGrade(root.left(), NN, pp);
                replaceGrade(root.right(), NN, pp);
            }
        }
    }
        
    
    public static void main(String[] args){
        /*
                    9
                  /   \
                 14   18
                /  \    \
               20  11    12
        
        */ 
        
        Student ss = new Student(100, "Juan Perez", 9);        
        Node<Student> root = new Node<>(ss);
        
        Node<Student> node2 = new Node<>(new Student(200, "Pedro Alvarez", 14));
        Node<Student> node3 = new Node<>(new Student(300, "Ana Juarez", 18));
        
        root.setLeft(node2);
        root.setRight(node3);
        
        Node<Student> node4 = new Node<>(new Student(400, "Maria Panta", 20));
        Node<Student> node5 = new Node<>(new Student(500, "Cesar Mendoza", 11));
        
        node2.setLeft(node4);
        node2.setRight(node5);
        
        Node<Student> node6 = new Node<>(new Student(500, "Ana Merino", 12));
        node3.setRight(node6);
        
        System.out.println(node6.value());
        replaceGrade(root, "Ana Merino", 13.4);
        System.out.println(node6.value());
    }
}
