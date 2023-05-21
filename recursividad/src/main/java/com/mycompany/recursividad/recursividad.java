/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.recursividad;

import static com.mycompany.recursividad.metodo.ackerman;
import java.util.Scanner;

/**
 *
 * @author Intel
 */
 public class recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int m=leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int n=leer.nextInt();
        System.out.println("El valor Ackerman es: " + ackerman(m,n));
        
    }
}
