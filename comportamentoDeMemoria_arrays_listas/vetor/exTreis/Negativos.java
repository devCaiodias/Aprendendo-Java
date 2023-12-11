package comportamentoDeMemoria_arrays_listas.vetor.exTreis;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] numero = new int[n];
        int menor = 0;

        for (int i = 0; i < numero.length; i++) {
            System.out.print("Dijite um numero: ");
            numero[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: ");
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] < menor) {
                menor = numero[i];
                System.out.println(menor);
            }
        }

    }
}
