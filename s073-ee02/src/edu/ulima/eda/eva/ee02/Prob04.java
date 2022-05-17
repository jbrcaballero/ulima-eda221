/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.eva.ee02;

/**
 *
 * @author JC
 */

class Point{
    //TODO: Definir atributos
    
    //crear
    public Point(int x, int y){
        //TODO: Implementar
    }
    //moverDerecha
    public void moveRight(int value){
        //TODO: Implementar
    }
    
    //moverArriba
    public void moveUp(int value){
        //TODO: Implementar
    }
    
    //esOrigen
    public boolean isOrigin(){
        boolean ans = false;
        //TODO: Implementar
        return ans;
    }
    
    //distancia
    public double getDistance(Point p){
        double ans = 0;
        //TODO: Implementar
        return ans;
    }
    
}
public class Prob04 {
    public static void main(String[] args){
        //Representa el punto (3,4)
        Point p = new Point(3, 4);

        //Mover a la derecha una distancia de 3
        p.moveRight(3);
        
        //Mover arriba una distancia de 1    
        p.moveUp(1);
        
        //Mostrar si el punto es el origen de coordenadas
        System.out.println(p.isOrigin());
        
        //Definimos un segundo punto (4, 10)
        Point p1 = new Point(4, 10);
        
        //Para saber la distancia entre p y p1 llamamos al metodo
        double distance = p.getDistance(p1);
        System.out.println("La distancia es: " + distance);
    }

}
