/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17_2;

import javax.swing.JOptionPane;

/**
 *
 * @author csantamariacameselle
 */
public class Boletin17_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos p1 = new Metodos();
        
        p1.cargarNotas();
        p1.calcularMedia();
        p1.verNotas();
        p1.verNotaAlta();
        
        p1.buscarNota("Manu");
        p1.alumnosAprobados();
        p1.ordenarNotas();
        p1.buscarNota(JOptionPane.showInputDialog("Escriba el nombre del alumno:"));
        
    }
    
}
