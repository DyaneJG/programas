//tania
package com.mycompany.metodo_ackermann;

import static com.mycompany.metodo_ackermann.metodo.ackerman;
import java.util.Scanner;
public class recursividad {
    public static void main(String[] args) {
         Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int m=leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int n=leer.nextInt();
        System.out.println("El valor Ackerman es: " + ackerman(m,n));
        
    }
    
}
