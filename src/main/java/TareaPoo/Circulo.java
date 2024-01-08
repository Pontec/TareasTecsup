package TareaPoo;

public class Circulo extends Figura{

    private double radio;
    private final double pi = Math.PI;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }


    @Override
    public double area() {
        return (radio*radio)* pi;
    }

    @Override
    public double perimetro() {
        return 2*pi*radio;
    }
}
