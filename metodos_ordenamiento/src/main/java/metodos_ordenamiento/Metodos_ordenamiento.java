
package metodos_ordenamiento;
import com.mycompany.metodos_ordenamiento.newpackage.metodos;
import java.util.Scanner;
public class Metodos_ordenamiento {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("1.-Burbuja \n2.-Inserccion Directa \n3.-Selección \n4.-shell \n5.-Recursividad Quicksort \nSeleccione un metodo: ");
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
                metodos.metodoburbuja(arreglo);
                 System.out.println(" ");
                System.out.println("Matriz ordenada");
                metodos.imprimirarreglo(arreglo);
               
                break;
            case 2:
                System.out.println(" ");
                 metodos.metododirecto(arreglo);
                 System.out.println(" ");
                 System.out.println("Matriz ordenada");
                 metodos.imprimirarreglo(arreglo);
               
                break;
            case 3:
                System.out.println(" ");
                 metodos.metodoseleccion(arreglo);
                  System.out.println(" ");
                 System.out.println("Matriz ordenada");
                 metodos.imprimirarreglo(arreglo);
               
                break; 
            case 4:
                System.out.println(" ");
                 metodos.shell(arreglo);
                  System.out.println(" ");
                 System.out.println("Matriz ordenada");
                 metodos.imprimirarreglo(arreglo);
                break;
                case 5:
                System.out.println(" ");
                metodos o=new metodos();
                o.ordenarQ(arreglo);
                  System.out.println(" ");
                 System.out.println("Matriz ordenada");
                 metodos.imprimirarreglo(arreglo);
                break;
            default:
                System.out.println("Numero no valido");
        }
    }
}
