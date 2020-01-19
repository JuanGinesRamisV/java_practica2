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
    //metodo del primer ejercicio
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

    public static void tabla_simetrica() {
        int tabla[][] = new int[4][4];
        int i;
        int j;
        boolean simetrica = true;
        boolean salir = true;
        Scanner scanner = new Scanner(System.in);
        for (i = 0; i < tabla.length; i++) {
            for (j = 0; j < tabla[i].length; j++) {
                System.out.println("Introduce el valor de la matriz que corresponde"
                        + "a (" + i + "," + j + ")");
                tabla[i][j] = scanner.nextInt();
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
        System.out.println("-------------------------");
        i = j = 0; //formateo las variables que usare para comprobar las matriz
        while (salir == true) {
            //condicion para salir del bucle si la matriz es simetrica
            if ((i == tabla.length - 1) && (j == tabla[i].length - 1)) {
                salir = false;
            }//se compara los elementos de la matriz
            if (tabla[i][j] != tabla[j][i]) {
                salir = false;
                simetrica = false;
                System.out.println("La matriz no es simetrica");
            }//incremento de las auxiliares
            if (j == tabla[i].length - 1) {
                j = 0;// si j se encuentra en la ultima posición de la matriz tabla[i]
                i++;//se resetea j i se le añade un +1 a i
            } else {
                j++;//si la condicion no pasa se suma un +1 a j
            }
        }//si la matriz es simetrica se indica al usuario
        if (simetrica == true) {
            System.out.println("La matriz es simetrica");
        }
    }

    public static void suma_matrices() {
        int matriz[][] = new int[3][3];
        int matriz1[][] = new int[3][3];
        int matriz_final[][] = new int[3][3];
        int i;
        int j;
        Scanner scanner = new Scanner(System.in);
        //llenar de valores la primera matriz
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                System.out.println("Introduce el valor de la matriz que corresponde"
                        + "a (" + i + "," + j + ") de la primera matriz");
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("--------");
        System.out.println("La primera matriz tiene los siguientes valores");
        //imprimir los valores de la primera matriz
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                if (j < matriz[i].length - 1) {
                    System.out.print(matriz[i][j]);
                } else {
                    System.out.println(matriz[i][j]);
                }
            }
        }
        //llenar de valores la segunda matriz
        for (i = 0; i < matriz1.length; i++) {
            for (j = 0; j < matriz1[i].length; j++) {
                System.out.println("Introduce el valor de la matriz que corresponde"
                        + "a (" + i + "," + j + ") de la segunda matriz");
                matriz1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("--------");
        System.out.println("La segunda matirz tiene estos valores");
        //imprimir los valores de la segunda matriz
        for (i = 0; i < matriz1.length; i++) {
            for (j = 0; j < matriz1[i].length; j++) {
                if (j < matriz1[i].length - 1) {
                    System.out.print(matriz1[i][j]);
                } else {
                    System.out.println(matriz1[i][j]);
                }
            }
        }
        // llenar los datos de la tercera matirz con el resultado de la suma
        for (i = 0; i < matriz1.length; i++) {
            for (j = 0; j < matriz1[i].length; j++) {
                matriz_final[i][j] = matriz[i][j] + matriz1[i][j];
            }
        }
        System.out.println("--------");
        System.out.println("La matriz resultante de sumar la primera matriz y"
                + "la segunda es esta");
        //imprimir los datos de la matriz final
        for (i = 0; i < matriz_final.length; i++) {
            for (j = 0; j < matriz_final[i].length; j++) {
                if (j < matriz1[i].length - 1) {
                    System.out.print(matriz_final[i][j]);
                } else {
                    System.out.println(matriz_final[i][j]);
                }
            }
        }
    }

    public static void diagonal_valores1() {
        int matriz[][] = new int[7][7];
        int i;
        int j;
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                if (j < matriz[i].length - 1) {
                    System.out.print(matriz[i][j]);
                } else {
                    System.out.println(matriz[i][j]);
                }
            }
        }
    }

    public static void matriz_marco(int x, int y) {
        int matriz[][] = new int[x][y];
        int i;
        int j;
        //lleno la matriz de valores
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                //si estamos en la linea final o inicial se llenan todo con 1
                if ((i == 0) || (i == matriz.length - 1)) {
                    matriz[i][j] = 1;
                } else if((i!=0 && j==0)||(i!=0 && j==matriz[i].length-1)){
                    matriz[i][j]=1;
                }else{
                    matriz[i][j]=0;
                }
            }
        }
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                if (j < matriz[i].length - 1) {
                    System.out.print(matriz[i][j]);
                } else {
                    System.out.println(matriz[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int x;// x e y se usan para el ejercicio de la matriz marco donde el 
        int y;//el usuario indica la dimensión de la matriz
        boolean salir = false;

        while (salir == false) {
            System.out.println("------------------------------");
            System.out.println("|1)Crear tabla bidimensional |");
            System.out.println("|2)Comprobar matriz simetrica|");
            System.out.println("|3)Sumar dos matrices de 3x3 |");
            System.out.println("|4)Diagonal con valores 1    |");
            System.out.println("|5)Matriz marco 8x6          |");
            System.out.println("|6)Matriz marco personalizada|");
            System.out.println("|7)Salir                     |");
            System.out.println("------------------------------");
            System.out.println("");
            System.out.println("Elige una opcion");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("----");
                    tabla_bidimensional();
                    System.out.println("----");
                    break;
                case 2:
                    System.out.println("----");
                    tabla_simetrica();
                    System.out.println("----");
                    break;
                case 3:
                    System.out.println("----");
                    suma_matrices();
                    System.out.println("----");
                    break;
                case 4:
                    System.out.println("----");
                    diagonal_valores1();
                    System.out.println("----");
                    break;
                case 5:
                    System.out.println("----");
                    matriz_marco(8,6);
                    System.out.println("----");
                    break;
                case 6:
                    System.out.println("----");
                    System.out.println("Introduce el valor x de la matriz");
                    x=scanner.nextInt();
                    if(x<0){
                        System.out.println("El valor que has introducido no "
                                + "es valido. Se ha establecido el valor por"
                                + "defecto que es 8");
                        x=8;
                    }
                    System.out.println("Introduce el valor y de la matriz");
                    y=scanner.nextInt();
                    if(y<0){
                        System.out.println("El valor que has introducido no es "
                                + "valido. Se ha establecido el valor por defe"
                                + "cto que es 6");
                        y=6;
                    }
                    System.out.println("La matriz resultante es la siguiente: ");
                    matriz_marco(x,y);
                    break;
                case 7:
                    System.out.println("Adios!!!!!");
                    salir = true;
            }
        }
    }

}
