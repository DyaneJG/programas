
import java.util.Scanner;
import metodos.metodos;

public class menu {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("1.-Busqueda secuencial \n2.-Busqueda binaria  \nSeleccione un metodo: ");
        int n = leer.nextInt();
        System.out.println("¿Cuantos datos desea en el areglo?");
        int n1 = leer.nextInt();

        int arreglo[] = new int[n1];
        metodos.llenararreglo(arreglo);
        System.out.println("Matriz original");
        metodos.imprimirarreglo(arreglo);

        switch (n) {
            case 1:
                System.out.println(" ");
                System.out.println("Numero a buscar");
                int n2 = leer.nextInt();

                metodos.shell(arreglo);
                System.out.println("Matriz ordenada");
                metodos.imprimirarreglo(arreglo);
                System.out.println(" ");
                int resultado = metodos.busquedaBinaria(arreglo, n2);

                if (resultado != -1) {
                    System.out.println("El numero " + n2 + " esta en la posicion:" + resultado);
                } else {
                    System.out.println("El dato no se encuentra en el arreglo, o el arreglo no estÃ¡ ordenado.");
                }
            case 2:
                System.out.println(" ");
                System.out.println("Numero a buscar");
                int n3 = leer.nextInt();

                int posicion = metodos.busquedaSecuencial(arreglo, n3);
               
                if (posicion != -1) {
                    System.out.println("El numero " + n3 + " esta en la posicion:" + posicion);
                } else {
                    System.out.println("Elemento no encontrado");
                }
                break;
            default:
                System.out.println("Numero no valido");
        }
    }

}
