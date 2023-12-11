package Programacaoorientadaaobjetos.ExecicioUm;

import java.util.Locale;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        retangulo.width = sc.nextDouble();
        retangulo.height = sc.nextDouble();

        System.out.printf("Area = %.2f%n", retangulo.Area());
        System.out.printf("Perimeter = %.2f%n", retangulo.Pirimetro());
        System.out.printf("Diagonal = %.2f%n", retangulo.Diagonal());

    }
}
