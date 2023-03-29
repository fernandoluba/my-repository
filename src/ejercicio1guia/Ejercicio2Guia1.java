/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2guia1;

import java.util.Scanner;

/**
 *
 * @author LUBANSKIF
 */
public class Ejercicio2Guia1 {
 // Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String nombre;
        Scanner leer=new Scanner(System.in);
        System.out.println("A continuacion ingrese su nombre");
        nombre=leer.nextLine();
        System.out.println("su nombre es " + nombre);
        
    }
    
}
