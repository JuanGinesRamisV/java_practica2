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
public class ejercicio4 {
    public static void main(String[] args) {
        int numeros[]= new int [10];
        Scanner scanner = new Scanner (System.in);
        int i;
        System.out.println("Introduce 10 numeros");
        for(i=0;i<numeros.length;i++){
            numeros[i]=scanner.nextInt();
        }
        System.out.println("-----------");
        int j=numeros.length-1;
        for(i=0;i<(numeros.length)/2;i++){
            System.out.println(numeros[i]);
            System.out.println(numeros[j]);
            j=j-1;
        }
    }
}
