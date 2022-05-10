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
class Polynomial{
    //Objeto de datos: array de coeficientes
    //Ejemplo: [1, 2, 0, 4] = 1 + 2x + 4x^3
    private Double[] coefArr;
    
    //Grado del polinomio
    private int degree;
    
    //Maximo grado del polinomio: 50
    private static int MAX_DEGREE = 50;
    
    public Polynomial(){
        this.coefArr = new Double[MAX_DEGREE];
        //Se puede utilizar Arrays.fill, pero por legibilidad lo hacemos manual
        for(int i = 0; i < MAX_DEGREE; i++){
            this.coefArr[i] = 0d;
        }
    }
    
    public void addTerm(double coefficient, int exp){
        if(exp > this.degree){
            this.degree = exp;
        }
        this.coefArr[exp] = coefficient;
    }
    
    public Double getTerm(int exp){
        Double ans = null;
        if(exp <= this.degree){
            ans = this.coefArr[exp];
        }
        return ans;
    }
    
    public int getDegree(){
        return this.degree;
    }
    
    public Double evaluate(double x){
        double ans = 0;
        double factor = 1;
        for(int i = 0; i <= this.degree; i++){
            ans = ans + (this.coefArr[i] * factor);
            factor = factor * x;
        }
        return ans;
    }
    
    
    public void add(Polynomial pol){      
        for(int i = 0; i <= pol.getDegree(); i++){
            this.coefArr[i] = this.coefArr[i] + pol.getTerm(i);
        }
        if(pol.getDegree() > this.degree){
            this.degree = pol.getDegree();
        }
    }
    
    public String toString(){
        String ans = "P(X) = ";
        for(int i = this.degree; i >= 0; i--){
            if(this.coefArr[i] != 0){
                if(i > 0){
                    ans = ans + (" + " + this.coefArr[i] + " X^"+ i);
                }else{
                    ans = ans + (" + " + this.coefArr[i] + " ");
                }
            }            
        }
        return ans;
    }
}

public class Prob05 {
    public static void main(String[] args){
        Polynomial p1 = new Polynomial();        
        p1.addTerm(3, 0);
        p1.addTerm(1, 1);
        p1.addTerm(1, 2);
        
        Polynomial p2 = new Polynomial();
        p2.addTerm(5, 0);
        p2.addTerm(4, 1);
        p2.addTerm(8, 3);
        p2.addTerm(3, 4);
                     
        System.out.println(p1);
        System.out.println(p2);
        
        System.out.println(p1.evaluate(2));
        p1.add(p2);
        System.out.println(p1);
    }
}
