/*
    Pedro ha ido de compras al centro comercial. Sin embargo, solamente
    tiene asignado un presupuesto de P soles. Los precios de los articulos
    se encuentran almacenados en un array. Implemente un algoritmo que retorne
    el precio del articulo que debera adquirir Pedro, tomando en cuenta que 
    su deseo es adquirir el articulo que tenga el mayor precio posible pero
    que no se exceda de su presupuesto.    
 */
package edu.ulima.eda.nota01.repaso;

/**
 *
 * @author JC
 */
public class Prob02 {
    
    public static float getMaxPrice(float[] prices, float P){
        float max = prices[0];
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > max && prices[i] <= P){
                max = prices[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args){
        float[] prices = {12, 7, 9, 14, 12.5f};
        float P = 13f;
        float max = getMaxPrice(prices, P);
        System.out.println("El precio del articulo que debe adquirirse es: " + max);
    }
}
