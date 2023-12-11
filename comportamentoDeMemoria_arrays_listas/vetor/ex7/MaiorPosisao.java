package comportamentoDeMemoria_arrays_listas.vetor.ex7;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosisao {
     public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] numero = new double[n];

        for (int i = 0; i < numero.length; i++) {
            System.out.print("Digite um numero: ");
            numero[i] = sc.nextDouble();
        }

        double max = 0;
        int posMaior = 0;
            for (int i = 0; i < numero.length; i++) {
                if (numero[i] > max) {
                    max = numero[i];
                    posMaior = i;
                }
            }

            System.out.printf("MAIOR VALOR = %.1f %n", max);

            System.out.printf("POSICAO DO MAIOR VALOR = %d", posMaior);
     }
}
