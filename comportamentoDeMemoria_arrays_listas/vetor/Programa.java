package comportamentoDeMemoria_arrays_listas.vetor;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }

        double suma = 0.00;
        for (int i = 0; i < n; i++) {
            suma += vect[i];
        }

        double avg = suma / n;

        System.out.printf("AVERAGE HEIGHT = %.2f",avg);
    }
}
