/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17;

/**
 *
 * @author csantamariacameselle
 */
public class Boletin17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] numeros = new int[6];
        for(int i= 0; i <= 6; i++){
            numeros[i] = (int) (Math.random()* 50 + 1);
        }
        
        for(int i= 6; i >= 0; i--){
            System.out.println(numeros[i]);
        }
        
    }
    
}
