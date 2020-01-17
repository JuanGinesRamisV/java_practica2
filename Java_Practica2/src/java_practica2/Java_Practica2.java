/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_practica2;

import java.util.Scanner;

/**
 *
 * @author juang
 */
public class Java_Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void tabla_bidimensional() {
        int tabla[][] = new int[5][5];
        int i;
        int j;
        for (i = 0; i < tabla.length; i++) {
            for (j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = (i + 1) + (j + 1);
            }
        }
        for (i = 0; i < tabla.length; i++) {
            for (j = 0; j < tabla[i].length; j++) {
                if (j < tabla[i].length - 1) {
                    System.out.print(tabla[i][j]);
                } else {
                    System.out.println(tabla[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println("------------------------------");
        System.out.println("|1)Crear tabla bidimensional |");
        System.out.println("|                            |");
        System.out.println("------------------------------");
        System.out.println("");
        System.out.print("Elige una opción: ");
        opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                tabla_bidimensional();
                System.out.println("----");
                break;

        }
    }

}
