
package com.mycompany.voraz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tania
 */
public class monedas {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] denominaciones = {100, 20, 10, 5, 1}; 
        ArrayList Cambio = new ArrayList(); 
        System.out.println("Nota: el monto debe ser entero, no acepta decimales");
        System.out.println("Ingrese monto a cambiar"); 
        int retiro = leer.nextInt();
        int x = 0; 
        int i = 0;
        int acum = 0; 
        int dif = retiro;

        if (retiro <= 1500) { 
            while (acum != retiro) {
                dif = dif - x; 
                x = metodo.seleccionar(denominaciones, dif); 
                acum = acum + x; 
                Cambio.add(x); 
                i++;
            }
            System.out.println("Cambio");
            for (int j = 0; j < Cambio.size(); j++) { 
                System.out.print(Cambio.get(j)+" ");
            }

        }else{
            System.out.println("No puedes solicitar mas de 1500");
        }
    }

}

