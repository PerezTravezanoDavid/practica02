/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica02;

/**
 *
 * @author DAVID
 */
public class ComparacionArreglos {

    public static void main(String[] args) {

        
        int[] arreglo1 = {10, 20, 30, 40};
        int[] arreglo2 = {10, 20, 30, 40};

        compararArreglos(arreglo1, arreglo2);

        System.out.println();

        
        int[] arreglo3 = {10, 20, 30, 40};
        int[] arreglo4 = {10, 25, 30, 40};

        compararArreglos(arreglo3, arreglo4);

        System.out.println();

        
        int[] arreglo5 = {10, 20, 30, 40};
        int[] arreglo6 = {10, 20, 30};

        compararArreglos(arreglo5, arreglo6);
    }

    public static void compararArreglos(int[] a, int[] b) {

        System.out.print("Arreglo 1: [");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("Arreglo 2: [");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
            if (i < b.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        if (a.length != b.length) {
            System.out.println("Resultado: Los arreglos son DIFERENTES");
            return;
        }

        boolean iguales = true;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                iguales = false;
                break;
            }
        }

        if (iguales) {
            System.out.println("Resultado: Los arreglos son IGUALES.");
        } else {
            System.out.println("Resultado: Los arreglos son DIFERENTES.");
        }
    }
}