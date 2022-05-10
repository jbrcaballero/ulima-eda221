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
class Triangle{
    private double[] x;             //abscisas
    private double[] y;             //ordenadas
    private double[] refSides;      //almacena el cuadrado de los lados (para comparar)

    public Triangle(double x1, double y1, double x2 , double y2, double x3, double y3){
        x = new double[3];
        y = new double[3];
        refSides = new double[3];

        x[0] = x1; x[1] = x2; x[2] = x3;
        y[0] = y1; y[1] = y2; y[2] = y3;

        //Calculo de lados
        //Referencia: https://www.mathplanet.com/education/algebra-2/conic-sections/distance-between-two-points-and-the-midpoint
        //Distancia 0-1
        refSides[0] = Math.pow(y[1] - y[0], 2) +  Math.pow(x[1] - x[0], 2);
        //Distancia 1-2
        refSides[1] = Math.pow(y[2] - y[1], 2) +  Math.pow(x[2] - x[1], 2);
        //Distancia 2-0
        refSides[2] = Math.pow(y[0] - y[2], 2) +  Math.pow(x[0] - x[2], 2);
    }
    public double getPerimeter(){
        return Math.sqrt(refSides[0]) +  Math.sqrt(refSides[1]) +  Math.sqrt(refSides[2]);
    }

    //Referencia: https://www.mathopenref.com/coordtrianglearea.html
    public double getArea(){
        double factor1 = x[0] * (y[1] - y[2]);
        double factor2 = x[1] * (y[2] - y[0]);
        double factor3 = x[2] * (y[0] - y[1]);
        return Math.abs(factor1 + factor2 + factor3) / 2;
    }
    //Referencia: Primera seccion
    //https://www.mathsisfun.com/triangle.html
    public String getType(){
        if(refSides[0] == refSides[1] && refSides[1] == refSides[2] ){
            return "Equilatero";
        }else if(refSides[0] == refSides[1] || refSides[1] == refSides[2] || refSides[0] == refSides[2]){
            return "Isosceles";
        }else{
            return "Escaleno";
        }
    }

    //Referencia: https://www.onlinemathlearning.com/pythagorean-theorem-converse.html
    public String getTypePerAngles(){
        //Obtenermos el mayor lado
        //Opcion 1: comparacion lado por lado
        //Opcion 2: ordenar el arreglo de lados al cuadrado
        //max2: Cuadrado de la longitud del mayor lado
        double max2 = refSides[0];
        //Suma de cuadrados de las longitudes de los lados
        double sum2 = 0d;
        String tipo = "";

        for(int i = 0; i < refSides.length; i++){
            if(refSides[i] > max2){
                max2 = refSides[i];
            }
            sum2 += refSides[i];
        }
        //Para hallar la suma de los 2 lados menores, extraigo el cuadrado del lado mayor
        sum2 -= max2;

        if(max2 < sum2){
            tipo = "Acutangulo";
        }else if(max2 == sum2){
            tipo = "Rectangulo";
        }else if(max2 > sum2){
            tipo = "Obtusangulo";
        }
        return tipo;  
    }

}        

public class Prob03 {
    public static void main(String[] args){
        Triangle t1 = new Triangle(0, 0, 3, 0, 3, 4);
        System.out.println(t1.getPerimeter());
        System.out.println(t1.getArea());        
        System.out.println(t1.getType());
        System.out.println(t1.getTypePerAngles());
    }
}
