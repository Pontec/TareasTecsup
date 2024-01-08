package TareaPoo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingresa el radio del circulo:");
        Scanner scanner = new Scanner(System.in);
        double radio = scanner.nextDouble();

        Circulo circulo = new Circulo(radio);


        System.out.println("Área del círculo: " + circulo.area());
        System.out.println("Perímetro del círculo: " + circulo.perimetro());


    }
}
