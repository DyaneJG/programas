
package metodos_ord;

import java.util.Random;

/**
 *
 * @author Intel
 */
public class metodo {
    public static int[] metodoburbuja(int arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {

                //comparamos el valor de x es mayor a la posicion que esta adelante
                if (arreglo[j] > arreglo[j + 1]) {
                    //guardamos en una variable nuestro valor j
                    int aux = arreglo[j];
                    //cambiamos el valor de j+1 por el mismo que j
                    arreglo[j] = arreglo[j + 1];
                    //cambiamos el valor de j+1 por el que guardamos en aux
                    arreglo[j + 1] = aux;
                }
                System.out.print(" ");

                System.out.print(arreglo[j] + " ");
            }
            System.out.println(" ");
        }
        return arreglo;

    }

    public static int[] metodoseleccion(int arreglo[]) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            /* tomamos como menor el primero de los elementos que quedan por ordenar 
            y guardamos su posición buscamos en el resto del arreglo algún elemento menor que el actual
            si hay alguno menor se intercambia  */

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
                System.out.print(" ");

                System.out.print(arreglo[j] + " ");
            }
            System.out.println(" ");
        }
        return arreglo;
    }

    public static int[] metododirecto(int arreglo[]) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            /* tomamos como menor el primero de los elementos que quedan por ordenar 
            y guardamos su posición buscamos en el resto del arreglo algún elemento menor que el actual
            si hay alguno menor se intercambia  */

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
                System.out.print(" ");

                System.out.print(arreglo[j] + " ");
            }
            System.out.println(" ");
        }
        return arreglo;
    }

    public static int[] shell(int arreglo[]) {

        int salto = arreglo.length / 2;
        while (salto > 0) {
            for (int i = salto; i < arreglo.length; i++) {
                int j = i - salto;
                while (j >= 0) {
                    int k = j + salto;
                    if (arreglo[j] <= arreglo[k]) {
                        j = -1;

                    } else {
                        int aux = arreglo[j];
                        arreglo[j] = arreglo[k];
                        arreglo[k] = aux;
                        j -= salto;
                    }
                }
                System.out.print(" ");
                System.out.print(arreglo[i] + " ");

            }
            System.out.println(" ");
            salto = salto / 2;
        }
        return null;
    }

    public void ordenarQ(int[] array) {
        array = quicksort1(array);
    }

    public int[] quicksort1(int numeros[]) {
        return quicksort2(numeros, 0, numeros.length - 1);
    }

    public int[] quicksort2(int numeros[], int izq, int der) {
        if (izq >= der) {
            return numeros;
        }
        int i = izq, d = der;
        if (izq != der) {
            int pivote;
            int aux;
            pivote = izq;
            while (izq != der) {
                while (numeros[der] >= numeros[pivote] && izq < der) {
                    der--;
                }
                while (numeros[izq] < numeros[pivote] && izq < der) {
                    izq++;
                }
                if (der != izq) {
                    aux = numeros[der];
                    numeros[der] = numeros[izq];
                    numeros[izq] = aux;
                }
            }
            if (izq == der) {
                quicksort2(numeros, i, izq - 1);
                quicksort2(numeros, izq + 1, d);
            }
        } else {
            return numeros;
        }
        return numeros;
    }
 

    public static int[] llenararreglo(int arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = new Random().nextInt(100);
        }
        return arreglo;
    }

    public static void imprimirarreglo(int arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(String.valueOf(arreglo[i]) + " ");
        }
    }
}
