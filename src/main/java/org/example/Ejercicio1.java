package org.example;

// Itera sobre los números del 1 al 50 e imprime solo los números pares.
public class Ejercicio1 {
    public static void main(String[] args) {

        int i;

        for(i=1; i<=50;i++){
            int par =i%2;
            if (par == 0){
                System.out.println("Resultado: " + i);
            }
        }
    }
}
