package Programacaoorientadaaobjetos.application;

import java.util.Locale;
import java.util.Scanner;

public class Programa{

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangulo x , y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Enter the measures of triangule X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangule y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        double areax = x.area();
        double areay = y.area();

        System.out.printf("Triangle X area: %.4f%n", areax);
        System.out.printf("Triangle Y area: %.4f%n", areay);

        if (areax > areay) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
            
        }

        
    }
}
