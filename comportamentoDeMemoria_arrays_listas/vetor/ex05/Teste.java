package comportamentoDeMemoria_arrays_listas.vetor.ex05;

import java.util.Locale;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        Altura[] pessoa = new Altura[n];

        for (int i = 0; i < pessoa.length; i++) {
            sc.nextLine();
            System.out.printf("Dados da %da pessoa: %n" ,i + 1);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            pessoa[i] = new Altura(nome, idade, altura);
        }

        double soma = 0.00;
        for (int i = 0; i < pessoa.length; i++) {
            soma += pessoa[i].getAltura();
        }

        int nmenores = 0;
        double altoral = 0;
        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i].getIdade() < 16) {
                nmenores++;
            }
            altoral = altoral + pessoa[i].getAltura();
        }


        double avg = soma / n;
        double percentualMenores = ((double)nmenores /n) * 100.0;

        System.out.printf("%nAltura média: %.2f%n", avg);
        System.out.printf("Pessoas com menos de 16 anos:  %.1f%%\n", percentualMenores);

        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i].getIdade() < 16) {
                System.out.printf("%s\n", pessoa[i].getNome());
            }
        }


    }
}
