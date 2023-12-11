package Programacaoorientadaaobjetos.application;

public class Triangulo {
    public double a;
    public double b;
    public double c;

    public double area() {
        double p = (a + b + c) / 2.0;
        double respt = Math.sqrt(p*(p - a) * (p - b) * (p - c));
        return respt;

    }

}
