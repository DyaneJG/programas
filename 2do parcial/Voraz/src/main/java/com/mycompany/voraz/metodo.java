
package com.mycompany.voraz;

/**
 *
 * @author Tania
 */
public class metodo {
    
    public static int seleccionar(int[] Bill, int dif) { //metodo de eleccion del billete ideal
        int aux = 0;

        for (int j = 0; j < Bill.length; j++) { 
            if (Bill[j] <= dif) { 
                aux = Bill[j]; 
                break;
            }
        }
        return aux; 
    }
}
