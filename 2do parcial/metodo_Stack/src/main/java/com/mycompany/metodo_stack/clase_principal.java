//Tania
package com.mycompany.metodo_stack;

import java.util.Stack;
public class clase_principal {
    public static void main(String[] args) {
       Stack<Persona> stack = new Stack<Persona>();
        Persona persona1 = new Persona();
        persona1.setNombre("Irving");
        persona1.setApellidos("Arroyo");

        Persona persona2 = new Persona();
        persona2.setNombre("Itzel");
        persona2.setApellidos("Castro");

        Persona persona3 = new Persona();
        persona3.setNombre("Brayan");
        persona3.setApellidos("Cruz");

        stack.push(persona3);
        stack.push(persona2);
        stack.push(persona1);
        System.out.println("Pila:=" + stack);
        System.out.println("Top of stack:=" + stack.peek());
        System.out.println("Eliminando el top of stack... ");
        //Metodo pop devuelve la parte superior de la pila y elimina el objeto de la parte superior de la pila. 
        stack.pop();
        System.out.println("pila:=" + stack);
        /*METODO search() devuelve la distancia desde la parte superior de la pila (desplazamiento) 
         hasta la ocurrencia más cercana a la parte superior de la pila.De lo contrario, el método devuelve -1.");
         */
        System.out.println("Buscando a la persona 3=" + stack.search(persona3));
        /*METODO empity() comprueba si la pila esta vacia
         */
        System.out.println("Check if stack is empty=" + stack.empty());
    }
    
}
