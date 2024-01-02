package org.example;

//Suma todos los números impares del 1 al 100.
public class Ejercicio2 {
    public static void main(String[] args) {
        int i;
        int suma=0;
        for(i=0; i<=100;i++){
            int par =i%2;
            if (par == 1){
                suma=suma+i;
            }
        }
        System.out.println(suma);
    }
}
