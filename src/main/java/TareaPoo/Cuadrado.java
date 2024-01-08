package TareaPoo;

public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return Math.pow(lado, 2);
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }
}
