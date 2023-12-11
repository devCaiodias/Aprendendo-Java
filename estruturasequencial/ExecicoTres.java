package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExecicoTres {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Exercício 01

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        
        // int soma = a + b;
        
        // System.out.printf("Soma; %d%n",soma);

        // //Exercício 02

        // double r = sc.nextDouble();
        // double pi = sc.nextDouble();
        // double resposta = pi * Math.pow(r,2);

        // System.out.printf("A= %.4f%n",resposta);

        // //Exercício 03

        // int x = sc.nextInt(), l = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();

        // int res= (x * l - c * d);

        // System.out.println(res);
        
    
        // //Exercício 04
        // int numero = sc.nextInt();
        // int ko = sc.nextInt();
        // double hora = sc.nextDouble();

        // double salario = ko * hora;

        // System.out.printf("Numero: %d%nSalario: U$%.2f", numero,salario);

        //Exercício 05

        // int cod1, cod2, qte1, qte2;
        // double preco1, preco2 , total;

        // cod1 = sc.nextInt();
        // qte1 = sc.nextInt();
        // preco1 = sc.nextDouble();

        // cod2 = sc.nextInt();
        // qte2 = sc.nextInt();
        // preco2 = sc.nextDouble();

        // total = preco1 * qte1 + preco2 * qte2;

        // System.out.printf("Valor A pagar: R$%.2f",total);

        //Exercício 06

        double v = sc.nextDouble();
        double m = sc.nextDouble();
        double n = sc.nextDouble();

        double triangulo = v * n / 2;
        double circulo = 3.14159 * Math.pow(n, 2);
        double trapezio = (v + m) / 2 * n;
        double quadrado = Math.pow(m, 2);
        double retangular = v * m;


        System.out.printf("Triangulo: %.3f%n",triangulo);
        System.out.printf("Circulo: %.3f%n",circulo);
        System.out.printf("Trapezio: %.3f%n",trapezio);
        System.out.printf("Quadrado: %.3f%n",quadrado);
        System.out.printf("Retangular: %.3f%n",retangular);

    }
}
