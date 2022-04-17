/*
    Implemente un algoritmo que permita, dados los lados de un triangulo
    (numeros enteros positivos) retornar el perimetro y el area del mismo.
    Referencia: Formula de Heron.
    https://en.wikipedia.org/wiki/Heron%27s_formula
 */
package edu.ulima.eda.nota01.repaso;

/**
 *
 * @author JC
 */
public class Prob03 {
    public static double[] getTriangleMetrics(int a, int b, int c){
        int perimeter = a + b + c;
        int p = perimeter / 2;
        double area = Math.sqrt(p * (p-a) * (p-b) * (p-c));
        double[] result = {perimeter, area};
        return result;
    }
    
    public static void main(String[] args){
        double[] res = getTriangleMetrics(3, 4, 5);
        System.out.println("El perimetro es: " + res[0]);
        System.out.println("El area es: " + res[1]);                
    }
}
