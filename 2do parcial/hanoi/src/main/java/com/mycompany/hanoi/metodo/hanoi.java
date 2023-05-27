/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hanoi.metodo;

/**
 *
 * @author Eq30
 */
public class hanoi {
    public static void hanoi(int n, int origen, int aux, int destino){
        if(n==1){
            System.out.println("mover disco de " + origen +" a "+ destino);  
        }else{
            hanoi(n-1,origen,destino,aux);
            System.out.println("mover disco de " + origen +" a "+ destino);
            hanoi(n-1,aux,origen,destino);
        }
    }
}
