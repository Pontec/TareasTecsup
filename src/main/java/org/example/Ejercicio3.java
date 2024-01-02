package org.example;

//Genera la tabla del 5 hasta el producto de 5x10
public class Ejercicio3 {
    public static void main(String[] args) {

        int resultado=0;
        int i=0;
        while (i<=10){
            resultado = 5* i;
            System.out.println("5 x "+i+" = "+resultado);
            i++;
        }

    }
}
