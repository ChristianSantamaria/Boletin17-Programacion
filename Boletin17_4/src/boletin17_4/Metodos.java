/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17_4;

/**
 *
 * @author csantamariacameselle
 */
public class Metodos {
    
    String tabla[] = new String[23];
    
    public void Metodos(){
        tabla[0] = "A3";
        tabla[1] = "B11";
        tabla[2] = "C20";
        tabla[3] = "D9";
        tabla[4] = "E22";
        tabla[5] = "F7";
        tabla[6] = "G4";
        tabla[7] = "H18";
        tabla[8] = "J13";
        tabla[9] = "K21";
        tabla[10] = "L19";
        tabla[11] = "M5";
        tabla[12] = "N12";
        tabla[13] = "P8";
        tabla[14] = "Q16";
        tabla[15] = "R1";
        tabla[16] = "S15";
        tabla[17] = "T0";
        tabla[18] = "V17";
        tabla[19] = "W2";
        tabla[20] = "X10";
        tabla[21] = "Y6";
        tabla[22] = "Z14";
    }
    
    
    public void calcularDNI(int num){
        int aux = num % 23;
        int aux2 = 0;
        for (int i = 0 ; i < tabla.length ; i++){
            aux2 = Integer.parseInt(tabla[i].substring(1));
            if(aux2 == aux){
                System.out.println("La letra es " + tabla[i].charAt(0));
                break;
            }
        }
        
    }
    
}
