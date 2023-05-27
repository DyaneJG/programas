
package com.mycompany.fibonacci;

import static com.mycompany.fibonacci.metodo.fibonacci;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int n=leer.nextInt();
        System.out.println("fibonacci de "+n+" es: "+fibonacci(n));
    }
    
}
