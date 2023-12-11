package comportamentoDeMemoria_arrays_listas.vetor.ex8;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();
        int[] numerosA = new int[n];
        int[] numerosB = new int[n];
        int[] numeroC = new int[n];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < numerosA.length; i++) {
            numerosA[i] = sc.nextInt();
        }
        
        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < numerosB.length; i++) {
            numerosB[i] = sc.nextInt();
        }

        for (int i = 0; i < numeroC.length; i++) {
            numeroC[i] = numerosA[i] + numerosB[i];
        }

        

        System.out.println("VETOR RESULTANTE: ");

        for (int i = 0; i < numeroC.length; i++) {
            System.out.printf("%d%n", numeroC[i]);
        }
        
    }
}
