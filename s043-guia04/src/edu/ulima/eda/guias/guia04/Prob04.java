/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.guias.guia04;

/**
 *
 * @author JC
 */

class ComplexNumber{
    private double real;
    private double imaginary;
    
    public ComplexNumber(double real, double imaginary){
        this.imaginary = imaginary;
        this.real = real;
    }
    
    public boolean isReal(){
        if(imaginary == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean isPurelyImaginary(){
        if(real == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean isZero(){
        if(real == 0 && imaginary == 0){
            return true;
        }else{
            return false;
        }
    }
    
    
    public double getArgument(){
        if(real > 0 && imaginary < 0){
            return Math.PI / 2;
        }else if(real > 0){
            return Math.atan(imaginary / real);
        }else if(imaginary >= 0){
            return Math.atan(imaginary / real) + Math.PI;
        }else{
            return Math.atan(imaginary / real) - Math.PI;
        }
    }
}


public class Prob04 {
    public static void main(String[] args){
        ComplexNumber n1 = new ComplexNumber(3, 4);     // 3 + 4i
        ComplexNumber n2 = new ComplexNumber(0, 3);     // 3i
        ComplexNumber n3 = new ComplexNumber(4, 0);     // 4
        ComplexNumber n4 = new ComplexNumber(0, 0);     // 0
        
        System.out.println(n2.isPurelyImaginary());
        System.out.println(n2.isReal());
        
        System.out.println(n3.isReal());
       
        System.out.println(n4.isZero());
        System.out.println(n4.isReal());
        
        System.out.println(n1.getArgument());
        System.out.println(n2.getArgument());
        System.out.println(n4.getArgument());
 
    }
}