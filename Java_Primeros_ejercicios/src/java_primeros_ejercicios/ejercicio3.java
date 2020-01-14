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
public class ejercicio3 {
    public static void main(String[] args) {
        int numeros_positivos=0;
        int numeros_negativos=0;
        int numero_ceros=0;
        int positivos=0;
        int negativos=0;
        int numeros[]=new int [5];
        int i;
        Scanner scanner= new Scanner(System.in);
        System.out.println("introduce 5 numeros por pantlla");
        for(i=0;i<numeros.length;i++){
            numeros[i]=scanner.nextInt();
        }
        for (i=0;i<numeros.length;i++){
            if(numeros[i]>0){
                numeros_positivos++;
                positivos+=numeros[i];
            }else if(numeros[i]<0){
                numeros_negativos++;
                negativos+=numeros[i];
            }else{
                numero_ceros++;
            }
        }
        System.out.println("------");
        if (numeros_positivos>0){
            System.out.println("La media de los numeros positivos es"+positivos/
                    numeros_positivos);
        }
        if(0<numeros_negativos){
            System.out.println("La media de los numeros negativos es"+negativos/
                    numeros_negativos);
        }
        if(numero_ceros==0){
            System.out.println("No se hay ningun cero");
        }else{
            System.out.println("Hay "+numero_ceros+" ceros");
        }
    }
}
