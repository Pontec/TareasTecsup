package org.example;

import java.util.Scanner;

//Suma todos los dígitos de un número ingresado por el usuario.
// No usar la conversión a String para resolver el problema.
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();

        int sumaDigitos = 0;
        while (numero != 0) {
            int digito = numero % 10;   // Obtener el último dígito
            sumaDigitos += digito;      // Sumar el dígito a la suma total
            numero /= 10;               // Eliminar el último dígito
        }
        System.out.println("La suma de los dígitos es: " + sumaDigitos);
    }
}
