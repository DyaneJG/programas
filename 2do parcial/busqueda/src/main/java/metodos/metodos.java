package metodos;

import java.util.Random;

/**
 *
 * @author Intel
 */
public class metodos {

    public static int busquedaBinaria(int[] arreglo, int dato) {
        int inicio = 0;
        int fin = arreglo.length - 1;
        int pos;
        while (inicio <= fin) {
            pos = (inicio + fin) / 2;
            if (arreglo[pos] == dato) {
                return pos;
            } else if (arreglo[pos] < dato) {
                inicio = pos + 1;
            } else {
                fin = pos - 1;
            }
        }
        return -1;
    }
    
    public static int busquedaSecuencial(int[] arreglo, int dato) {
         Integer pos = null;
        for (int i = 0; i < arreglo.length; i++) {
            if (dato == arreglo[i]) {
                pos = i;
                break;
            }
        }
        return pos;
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
            }
            salto = salto / 2;
        }
        return null;
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
