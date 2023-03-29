/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5guia1;

import java.util.Scanner;

/**
 *
 * @author LUBANSKIF
 */
public class Ejercicio5Guia1 {
//Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese un numero entero");
        num1=leer.nextInt();
        System.out.println("el doblee del numero es " + (num1*2));
        System.out.println("el triple del numero es " + (num1*3));
        System.out.println("la raiz cuadrada es " + Math.sqrt(num1));
        
    }
    
}
