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
    private int x;
    private int y;

    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }   
    //crear
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    //moverDerecha
    public void moveRight(int value){
        this.x = this.x + value;
    }
    
    //moverArriba
    public void moveUp(int value){
        this.y = this.y + value;
    }
    
    //esOrigen
    public boolean isOrigin(){
        if(this.x == 0 && this.y == 0){
            return true;
        }else{
            return false;
        }        
    }
    
    //distancia
    public double getDistance(Point p){        
        int x1 = p.getX();
        int y1 = p.getY();        
        double distance = Math.sqrt(Math.pow(y1 - this.y, 2) + Math.pow(x1 - this.x, 2));
        return distance;
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
        Point p1 = new Point(0, 0);
        
        //Para saber la distancia entre p y p1 llamamos al metodo
        double distance = p.getDistance(p1);
        System.out.println("La distancia es: " + distance);
    }

}
