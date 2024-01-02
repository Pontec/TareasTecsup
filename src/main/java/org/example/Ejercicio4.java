package org.example;

import java.util.Scanner;

// Calcula el factorial de un número
// ingresado por el usuario. El factorial
// de un número n (representado como)
// es el producto de todos los enteros positivos menores o iguales a n.
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("********Calculando factorial******");
        System.out.println("Ingrese el numero: ");
        int factorial= scanner.nextInt();

        int n=1;
        for (int i=1;i<=factorial;i++){
            n = n*i;
        }
        System.out.println("El factorial de "+factorial + " es: " +n);
    }
}