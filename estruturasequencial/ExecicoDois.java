package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExecicoDois {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double area = largura * comprimento;

        double metroQuadrado = sc.nextDouble();
        double preco = area * metroQuadrado;

        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Preço: %.2f", preco);

        sc.close();

    }
}
