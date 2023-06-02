
import java.util.Scanner;
public class EjCola {
    
    public static void main(String[] args) {
       Cola A = new Cola();
        int indice;
        int opc = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("****BIENVENIDO A ÁRBOL BINARIO ORDENADO****");
        do {
            System.out.println("MENÚ\n");
            System.out.println("1.Insertar");
            System.out.println("2.Eliminar");
            System.out.println("3.Recorrido de la cola");
            System.out.println("4.Tamaño de la cola");
            System.out.println("5.Imprimir cola");
            System.out.println("6.Vacia o no");
            System.out.println("7.Salir");
            System.out.println("seleccione opción --->\n");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Dame el número a insertar\n");
                    int p = leer.nextInt();
                    A.encolar(nv);
                    break;
                case 2:
                    A.sacar();
                    break;
                case 3:
                    System.out.print("El recorrido en Preorden es: ");
                    A.recorreCola();
                    System.out.println();
                    break;
                case 4:
                    System.out.print("El recorrido en Inorden es: ");
                    A.size();
                    System.out.println();
                    break;
                case 5:
                    System.out.print("El recorrido en Postorden es: ");
                    A.toString();
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Vacio");
                    A.isEmpty();
                    break;
            }//fin switch
        } while (opc!= 7);//fin do
    }
    
}
