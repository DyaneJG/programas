//Tania Dyane Jimenez Granillo

public class Cola {

    private Nodo frente; //primer en entrar
    private int tamanio; // tamaño de la cola

    public Cola() { //Constructor
        frente = null; //No hay elementos
        this.tamanio = 0; // tamaño cero
    }

    public boolean isEmpty() {
        return frente == null;
    }

    public int size() {
        return this.tamanio;
    }

    public Nodo raiz() {
        if (isEmpty()) {
            return null;
        } else {
            return frente;
        }
    }

    public void sacar() { // método desencolar
        System.out.println("Inicia método sacar ");
        if (frente != null) {
            System.out.println("Valor sacado " + frente.getElemento());
            Nodo s = frente.getSiguiente();
            frente = s;
        }
        this.tamanio--;
    }

    public void encolar(Nodo nv) {
        if (frente == null) {
            frente = nv;
            System.out.println("Valor insertado " + nv.getElemento());
        } else {
            Nodo s = recorreCola();
            if (s.getSiguiente() == null) {
                System.out.println("Valor insertado " + nv.getElemento());
                s.setSiguiente(nv);
                this.tamanio++;
            }
        }
    }

    public Nodo recorreCola() {
        System.out.println("Inicia método recorrer cola");
        System.out.println("Valor visitado " + frente.getElemento());
        Nodo i = frente;
        Nodo s = new Nodo(0, null);
        while (i.getSiguiente() != null) {
            s = i.getSiguiente();
            System.out.println("Valor visitado " + s.getElemento());
            i = s;
        }
        return i;
    }

    public String toString() {
        if (isEmpty()) {
            return "La cola esta vacía";
        } else {
            String resultado = "";
            Nodo aux = frente;
//Recorro la pila
            while (aux != null) {
                resultado += aux.toString();
                aux = aux.getSiguiente();
            }
            return resultado;
        }
    }
}
