/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.listas.test;

import edu.ulima.eda.listas.genericas.Node;
import edu.ulima.eda.listas.genericas.LinkedList;

/**
 *
 * @author JC
 */
class Student{
    private int id;
    private String name;
    
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public String toString(){
        return "id: " + id + "| name: " + name;
    }
    
    public boolean equals(Object object){
        boolean ans = false;
        if(object instanceof Student){
            Student student = (Student) object;
            if(student.getId() == this.id){
                ans = true;
            }
        }
        return ans;
    }
    
}

public class TestGenericList {
    public static void main(String[] args){
        LinkedList<String> nombres = new LinkedList<>();
        nombres.addLast("Pedro");
        nombres.addLast("Mariana");
        nombres.addLast("Cesar");
        nombres.addLast("Alejandra");
        nombres.addFirst("Roberto");
        nombres.showElements();
        
        LinkedList<Student> list = new LinkedList<>();
        list.addLast(new Student(100, "Juan Perez"));
        list.addLast(new Student(200, "Carla Zarate"));
        list.addLast(new Student(300, "Marina Vargas"));
        list.showElements();
        
        Node<Student> ptr = list.getL();
        int id = 100;
        while(ptr != null){
            Student s1 = ptr.value();
            if(s1.getId() == id){
                System.out.println("El nombre del estudiante de codigo " + id 
                        + " es: " + s1.getName());
            }
            ptr = ptr.next();
        }               
        
    }
}
