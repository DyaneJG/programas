//Tania Dyane Jimenez Granillo
package experimento;

import Dominio.Arbol_manzana;

public class Experimento_Manzana {
    private Arbol_manzana[] manzanos;

    public int getPromedioNumeroManzanas() {
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            suma = suma + manzanos[i].getNumeroFrutas();
        }
        return suma / 5;
    }

    public int getPromedioAlturaArbolManzana() {
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            suma = suma + manzanos[i].getAlturaCm();
        }
        return suma / 5;
    }

    public int getPromedioPesoManzana() {
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            suma = suma + manzanos[i].getPesoPromedioFruta();
        }
        return suma / 5;
    }

    public void setManzanos(Arbol_manzana[] manzanos) {
        this.manzanos = manzanos;
    }
}
