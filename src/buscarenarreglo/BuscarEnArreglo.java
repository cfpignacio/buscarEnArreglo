/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscarenarreglo;

import javax.swing.JOptionPane;

/**
 *
 * @author Notebook
 */
public class BuscarEnArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] numeros = {32, 90, 49, 11, 20, 35};

        int numeroS = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que quiere buscar "));

        Boolean busqueda = false;

        for (int n : numeros) {
            if (n == numeroS) {
                busqueda = true;
            }

        }

        if (!busqueda) {
            System.out.println("Su numero NO SE ENCUENTRA " + numeroS);
        } else {

            System.out.println("Su numero se encuentra en nuestro arreglo " + numeroS);
        }

    }

}
