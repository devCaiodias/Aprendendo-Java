package comportamentoDeMemoria_arrays_listas.vetor.exDois;

import java.util.Locale;
import java.util.Scanner;

public class Programap2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Produto[] vect = new Produto[n];

        for (int i = 0; i < n; i++) {
           sc.nextLine();
           String nome = sc.nextLine();
           double price = sc.nextDouble();
           vect[i] = new Produto(nome, price);
        }

        double soma = 0.00;
        for (int i = 0; i < n; i++) {
            soma += vect[i].getPrice();
        }

        double avg = soma / n;

        System.out.printf("AVERAGE PRICE = %.2f",avg);
    }
}
