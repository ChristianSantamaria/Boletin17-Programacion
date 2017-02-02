/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17_2;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author csantamariacameselle
 */
public class Metodos {
    String alumnos[] = new String[4];
    int notas[] = new int[4];
    
    
    public void cargarNotas(){
        alumnos[0] = "Manu";
        alumnos[1] = "Paco";
        alumnos[2] = "Rober";
        alumnos[3] = "Teo";
        for(int i = 0; i<notas.length; i++){
            notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Escriba la nota de "+ alumnos[i]));
        }
    }
    
    public void calcularMedia(){
        int media = 0;
        for(int i = 0; i<notas.length; i++){
            media += notas[i];
        }
        System.out.println("La media de la clase es de: " + media/4);     
    }
    
    public void verNotas(){
        int aprobados = 0;
        int suspensos = 0;
        for(int i = 0; i<notas.length; i++){
            if (notas[i]>= 5)
                aprobados += 1;
            else
                suspensos += 1;
        }
        
        System.out.println("Hay " + aprobados + " alumnos aprobados y " + suspensos +" suspensos");
    }
    
    public void verNotaAlta(){
        int aux = 0;
        for(int i = 0; i<notas.length; i++){
            if (notas[i] > aux){
                aux = notas[i];
            }
        }
        System.out.println("La nota mas alta es: " + aux);
    }
    
    public void buscarNota(String nome){
        boolean aux = false;
        for(int i = 0; i<alumnos.length; i++){
            if (alumnos[i].equals(nome)){
                System.out.println("La nota de  " + alumnos[i] + " es " + notas[i]);
                aux = true;
                break;
            }
        }
        if (aux == false)
            System.out.println("No se encontro el alumno");
    }
    
    public void alumnosAprobados(){
        
        for(int i = 0; i<notas.length; i++){
            if (notas[i]>= 5)
                System.out.println(alumnos[i]);
        }

    }
    
    public void ordenarNotas(){
        int arrayAux[] = new int[4];
        
        for (int i = 0 ; i < notas.length ; i++){
            arrayAux[i] = notas[i];
        }
        Arrays.sort(arrayAux);
    }
    
}
