package comportamentoDeMemoria_arrays_listas.vetor.ex6;

import java.util.Locale;
import java.util.Scanner;

public class NumeroPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        int qtdPares = 0;
        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i]%2 == 0) {
                System.out.printf("%d ",vect[i]);
                qtdPares++;
            }
        }

        System.out.printf("%nQUANTIDADE DE PARES = %d", qtdPares);

    }
}
