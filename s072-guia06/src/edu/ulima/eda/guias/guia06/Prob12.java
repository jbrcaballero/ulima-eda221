/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.guias.guia06;

import edu.ulima.eda.pilas.genericas.Stack;

/**
 *
 * @author JC
 */
public class Prob12 {
    
    public static boolean isPalindrome(String text){
        Stack<Character> letters = convert(text);
        boolean ans = true;
        for(int i = 0; i < text.length() && ans == true; i++){
            if(text.charAt(i) != letters.pop()){
                ans = false;
            }
        }
        return ans;
    }
    
    public static Stack<Character> convert(String text){
        Stack<Character> res = new Stack<>();
        for(int i = 0; i < text.length(); i++){
            res.push(text.charAt(i));
        }
        return res;
    }
    
    public static void main(String[] args) {
        String s1 = "ANITALAVALATINA";
        String s2 = "ABCD";
        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
    }
    
}
