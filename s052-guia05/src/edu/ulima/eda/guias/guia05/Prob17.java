/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.guias.guia05;

import edu.ulima.eda.listas.genericas.Node;
import edu.ulima.eda.listas.genericas.LinkedList;



/**
 *
 * @author JC
 */
class Grade{
    int studentId;
    int courseNo;
    int finalGrade;
    
    public Grade(int studentId, int courseNo, int finalGrade){
        this.studentId = studentId;
        this.courseNo = courseNo;
        this.finalGrade = finalGrade;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getCourseNo() {
        return courseNo;
    }

    public int getFinalGrade() {
        return finalGrade;
    }
    
    public String toString(){
        return studentId + "-" + courseNo + "-" + finalGrade;
    }    
}

public class Prob17 {
    
    public static float getAverage(LinkedList<Grade> gradeList, int X){
        //Obtenemos el primer nodo
        Node<Grade> ptr = gradeList.getL();
        //Para el promedio necesitamos la suma y la cantidad
        int sum = 0;
        int count = 0;
        //Recorremos la lista
        while(ptr != null){
            //Obtenemos el objeto que almacena el nodo actual
            Grade g = ptr.value();
            //Verificamos si se trata de una nota del alumno buscado
            if(g.getStudentId() == X){
                //Incrementamos la suma y el promedio
                sum = sum + g.getFinalGrade();
                count = count + 1;
            }
            ptr = ptr.next();
        }
        return 1.0f * sum / count;
    }
    
    public static void main(String[] args){
        LinkedList<Grade> list = new LinkedList<>();
        Grade g1 = new Grade(200, 150, 14);
        list.addLast(g1);        
        list.addLast(new Grade(100, 200, 14));
        list.addLast(new Grade(100, 300, 16));        
        list.addLast(new Grade(200, 255, 11));
        list.addLast(new Grade(100, 450, 12));
        list.addLast(new Grade(200, 450, 18));        
        list.showElements();
        
        System.out.println(getAverage(list, 200));
        
    }    
}
