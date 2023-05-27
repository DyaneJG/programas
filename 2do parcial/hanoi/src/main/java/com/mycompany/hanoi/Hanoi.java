
package com.mycompany.hanoi;

import static com.mycompany.hanoi.metodo.hanoi.hanoi;
import java.util.Scanner;

public class Hanoi {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Numero de discos: ");
        n=leer.nextInt();
        hanoi(n,1,2,3);
    }
}
