//Tania Dyane Jimenez Granillo
package com.mycompany.metodo_ordenamiento;

import java.util.Scanner;
import metodos_ord.metodo;

/**
 *
 * @author Intel
 */
public class indice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("1.-Burbuja \n2.-Inserccion Directa \n3.-Seleccion \n4.-shell \n5.-Recursividad Quicksort \nSeleccione un metodo: ");
        int n = leer.nextInt();
       System.out.println("¿Cuantos datos desea en el areglo?");
        int n1 = leer.nextInt();

        int arreglo[] = new int[n1];
        metodo.llenararreglo(arreglo);
        System.out.println("Matriz original");
       metodo.imprimirarreglo(arreglo);
       

        switch (n) {
            case 1:
                System.out.println(" ");
                metodo.metodoburbuja(arreglo);
                 System.out.println(" ");
                System.out.println("Matriz ordenada");
                metodo.imprimirarreglo(arreglo);
               
                break;
            case 2:
                System.out.println(" ");
                 metodo.metododirecto(arreglo);
                 System.out.println(" ");
                 System.out.println("Matriz ordenada");
                 metodo.imprimirarreglo(arreglo);
               
                break;
            case 3:
                System.out.println(" ");
                 metodo.metodoseleccion(arreglo);
                  System.out.println(" ");
                 System.out.println("Matriz ordenada");
                 metodo.imprimirarreglo(arreglo);
               
                break; 
            case 4:
                System.out.println(" ");
                 metodo.shell(arreglo);
                  System.out.println(" ");
                 System.out.println("Matriz ordenada");
                 metodo.imprimirarreglo(arreglo);
                break;
                case 5:
                System.out.println(" ");
                metodo o=new metodo();
                o.ordenarQ(arreglo);
                  System.out.println(" ");
                 System.out.println("Matriz ordenada");
                 metodo.imprimirarreglo(arreglo);
                break;
            default:
                System.out.println("Numero no valido");
        }
    }
    
}
