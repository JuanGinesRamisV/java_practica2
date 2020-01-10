/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_primeros_ejercicios;

import java.util.Scanner;

/**
 *
 * @author juang
 */
public class ejercicio2 {
    public static void main(String[] args) {
        int numeros[]= new int[5];
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce 5 numeros");
        for(i=0;i<numeros.length;i++){
            numeros[i]=scanner.nextInt();
        }
        System.out.println("has introducido los numeors en el siguiente orden");
        System.out.println("hola");
        for(i=4;i>=0;i=i-1){
            System.out.println(numeros[i]);
        }
    }
    
}
