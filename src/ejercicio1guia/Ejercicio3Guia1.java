/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3guia1;

import java.util.Scanner;

/**
 *
 * @author LUBANSKIF
 */
public class Ejercicio3Guia1 {
// Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        String frase;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese una frase y se la mostraremos en mayuscula y minuscula");
        frase=leer.nextLine();
        System.out.println("la frase en mayuscula es " + frase.toUpperCase());
        System.out.println("la frase en minuscula es " + frase.toLowerCase());
        

    }
    
}

