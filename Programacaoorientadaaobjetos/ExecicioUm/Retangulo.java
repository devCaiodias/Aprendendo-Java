package Programacaoorientadaaobjetos.ExecicioUm;

public class Retangulo {
    public double width;
    public double height;

    public double Area(){
        double total = width * height;
        return total;
    }

    public double Pirimetro(){
        double total = 2*(width + height);
        return total;
    }

    public double Diagonal(){
        double total = Math.sqrt(Math.pow(width,2.0) + Math.pow(height, 2.0));
        return total;
    }
}
