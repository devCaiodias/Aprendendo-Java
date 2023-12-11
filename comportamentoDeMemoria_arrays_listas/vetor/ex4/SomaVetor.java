package comportamentoDeMemoria_arrays_listas.vetor.ex4;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] numero = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            numero[i] = sc.nextDouble();
        }

        System.out.print("Valores = ");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + " ");
        }

        System.out.println();
        System.out.print("Soma= ");
        double soma = 0.00;
        for (int i = 0; i < numero.length; i++) {
            soma += numero[i];
        }

        System.out.println(soma);

        double avg = soma / n;

        System.out.printf("Media = %.2f", avg);



    }

}
