
package com.mycompany.exponente;
public class metodo {
     public static int recursividad(int b,int e){
        if(e==0){
            return 1;
        }
        else
            return b*recursividad(b,e-1);
    }
}
