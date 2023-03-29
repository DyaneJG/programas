//Tania Dyane Jimenez Granillo
package com.mycompany.exponente;

import static com.mycompany.exponente.metodo.recursividad;
import java.util.Scanner;
public class Potencia {
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el numero a elevar: ");
        int base=leer.nextInt();
        System.out.println("Ingrese el exponente: ");
        int exponente=leer.nextInt();
        System.out.println(recursividad(base,exponente));
    }
    
}
