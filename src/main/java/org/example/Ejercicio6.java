package org.example;

//Encuentra y muestra todos los cuadrados perfectos hasta 100.
public class Ejercicio6 {
    public static void main(String[] args) {

        for(int i=1; i<=10; i++){
            int cuadrado = i * i;
            if (cuadrado <= 100) {
                System.out.println("El cuadrado de "+ i+ " es: "+cuadrado);
            } else {
                break;
            }
        }


    }
}
